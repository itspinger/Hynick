package net.pinger.hynick;

public interface FeatureManager {

    /**
     * This method registers the specified feature. If this method is called after
     * the previous features have already been loaded with {@link HynickFeature#load()},
     * then the user calling this method will have to manually call the method once,
     * after which the feature will again be accessible.
     *
     * @param features the features to register
     */

    void registerFeature(HynickFeature... features);

    /**
     * This method loads all features that are currently registered under this
     * feature manager.
     *
     * @see #registerFeature(HynickFeature...)
     */

    void load();
}
