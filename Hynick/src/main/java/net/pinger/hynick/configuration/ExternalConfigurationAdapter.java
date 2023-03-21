/*
 * MIT License
 *
 * Copyright (c) 2022 pinger (Dimitrije Mijailovic)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.pinger.hynick.configuration;

import net.pinger.hynick.HynickFeature;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.util.Map;
import java.util.logging.Level;

public abstract class ExternalConfigurationAdapter extends HynickFeature {

    private final File file;
    protected YamlConfiguration configuration;

    public ExternalConfigurationAdapter(JavaPlugin plugin, String name)  {
        this(plugin, name, false);
    }

    public ExternalConfigurationAdapter(JavaPlugin plugin, String name, boolean load) {
        super(plugin);

        // Create a file with this resource name
        this.file = new File(plugin.getDataFolder(), name);
        this.configuration = YamlConfiguration.loadConfiguration(this.file);

        // If the load is false
        // We shouldn't replace if the file is not empty
        if (!load && this.file.length() > 0) {
            return;
        }

        // Load resource by this name
        // And add the configuration section
        InputStream inputStream = plugin.getResource(name);

        // Throw IllegalArgumentException
        // If this file cannot be found
        if (inputStream == null) {
            throw new IllegalArgumentException("File resource cannot be found (" + name + ")");
        }

        // Try to read from the input stream
        // And add to the file
        try (Reader reader = new InputStreamReader(inputStream)) {
            // Load the configuration
            YamlConfiguration keyed = YamlConfiguration.loadConfiguration(reader);

            // If we shouldn't copy the defaults, return here
            // Copy the defaults
            this.configuration.options().copyDefaults(true);

            // Try to add defaults from resourceConfig
            // To the main configuration, by looping over the keys
            for (Map.Entry<String, Object> entries : keyed.getValues(true).entrySet()) {
                this.configuration.addDefault(entries.getKey(), entries.getValue());
            }

            // Now for the last step
            // We have to save the configuration we made
            // From the object
            this.configuration.save(this.file);
        } catch (IOException e) {
            plugin.getLogger().log(Level.INFO, "Failed to create a file with name " + name, e);
        }
    }

    @Override
    protected void load() {

    }

    @Override
    protected void reload() {
        this.configuration = YamlConfiguration.loadConfiguration(this.file);
    }
}
