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
