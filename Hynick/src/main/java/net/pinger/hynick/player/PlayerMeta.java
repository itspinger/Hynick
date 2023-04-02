package net.pinger.hynick.player;

import net.pinger.disguise.Skin;
import net.pinger.hynick.rank.Rank;

import javax.annotation.Nonnull;

public interface PlayerMeta {

    /**
     * This method returns the holder of this meta, which
     * can be active or not active.
     * <p>
     * It is safe calling this method, in meaning that it
     * will never be null.
     *
     * @return the holder of this meta
     */

    @Nonnull
    HynickPlayer getPlayer();

    /**
     * This method returns whether this meta is currently active.
     * <p>
     * Do note that at one time, only one {@link PlayerMeta}
     * can be active.
     *
     * @return whether this meta is active
     */

    boolean isActive();

    /**
     * This method returns the skin this meta contains.
     *
     * @return the skin
     */

    Skin getSkin();

    /**
     * This method returns the rank this meta contains.
     *
     * @return the rank
     */

    @Nonnull
    Rank getRank();

    /**
     * This method returns the name this meta contains.
     *
     * @return the name
     */

    @Nonnull
    String getName();

}
