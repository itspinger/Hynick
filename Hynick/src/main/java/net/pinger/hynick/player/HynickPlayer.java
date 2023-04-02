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
 *
 */

package net.pinger.hynick.player;

import net.pinger.hynick.view.BookView;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public interface HynickPlayer {

    /**
     * This method loads the player meta from the database.
     * <p>
     * This method is only called once when the server joins,
     * and the data is saved to the database, and removed from
     * the local cache.
     */

    void load();

    /**
     * This method retrieves the active meta from the
     * player metadata properties.
     * <p>
     * Do note that for the meta to be retrieved in this method,
     * it has to be in the last index of the collection.
     * <p>
     * If the retrieved meta is not active, or the meta is empty,
     * this method will return null.
     *
     * @return the active meta
     */

    @Nullable
    default PlayerMeta getActiveMeta() {
        // Since the player meta is sorted by the date
        // The last element will always be the one
        // That we need to check for
        PlayerMeta meta = this.getRecentMeta();

        // If the retrieved meta is null
        // Then we don't have the recent meta
        if (meta == null) {
            return null;
        }

        return meta.isActive() ? meta : null;
    }

    /**
     * This method returns the latest meta registered,
     * regardless if it is active or not.
     * <p>
     * If you need to get the active meta, you can either
     * check if the meta returned from this method is active,
     * or you can just use {@link #getActiveMeta()} for that
     * task.
     *
     * @return the last meta
     */

    @Nullable
    default PlayerMeta getRecentMeta() {
        if (this.getPlayerMeta().isEmpty()) {
            return null;
        }

        // Get the last element
        return this.getPlayerMeta().get(this.getPlayerMeta().size() - 1);
    }

    /**
     * This method returns all meta that were
     * retrieved for this player.
     *
     * @return metas retrieved for this player
     */

    List<PlayerMeta> getPlayerMeta();

    /**
     * This method returns the current {@link BookView view} of this player.
     *
     * <p>
     * If there is no view opened for this player, this will return null.
     *
     * @return the current view of this player
     */

    @Nullable
    BookView getView();

    /**
     * This method overrides the {@link #getView() current view} of the player.
     *
     * @param view the view to override with
     */

    void setView(BookView view);

    /**
     * This method returns the {@link UUID} of this player, which may not be null.
     *
     * @return the uuid of the player
     */

    @Nonnull
    UUID getId();

    /**
     * This method sends a formatted message from the configuration file
     * to this player.
     * <p>
     * Do not do this if you want to send a message that is not within the messages.yml file.
     *
     * @param key they key from the config
     * @param format the objects to format
     */

    void sendMessage(String key, Object... format);

    /**
     * This method sends a raw formatted message from the configuration file
     * to this player.
     * <p>
     * Do not do this if you want to send a message that is not within the messages.yml file.
     *
     * @param key they key from the config
     * @param format the objects to format
     */

    void sendRawMessage(String key, Object... format);

    /**
     * This method returns the {@link Player bukkit player} fetched
     * from the {@link #getId() id} of the player.
     *
     * <p>
     * If the player fetched from the id is not online,
     * this method will return null.
     *
     * @return the bukkit instance of the player
     */

    default Player bukkit() {
        return Bukkit.getPlayer(this.getId());
    }

}
