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

package net.pinger.hynick;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class HynickFeature {

    protected final JavaPlugin plugin;

    /**
     * Constructs a new {@link HynickFeature feature} with the given plugin
     * which this feature is a part of.
     *
     * @param plugin the plugin
     */

    protected HynickFeature(JavaPlugin plugin) {
        this.plugin = plugin;

        // Register this feature
        this.register();
    }

    /**
     * This method loads this feature.
     *
     * <p>
     * This method is called upon all features, once the plugin is ready
     * to read through all of them.
     */

    protected abstract void load();

    /**
     * This method reloads this feature. It is normally combined with other features,
     * where all features are reloaded at once.
     *
     * <p>
     * For example, when we do /hynick reload, all {@link HynickFeature featuers} will
     * be reloaded at the same time.
     */

    protected abstract void reload();

    /**
     * This method registers this feature to the {@link FeatureManager} handler.
     * <p>
     * Note that this method is automatically called when this instance is created.
     *
     * @see Hynick#getFeatureManager()
     * @see FeatureManager
     */

    private void register() {
        HynickAPI.getFeatureManager().registerFeature(this);
    }

}
