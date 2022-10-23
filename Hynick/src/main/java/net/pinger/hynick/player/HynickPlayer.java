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

import net.pinger.hynick.HynickRecord;
import net.pinger.hynick.PlayerHynickRecord;
import net.pinger.hynick.view.BookView;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.UUID;

public interface HynickPlayer {

    /**
     * This method sets the {@link PlayerHynickRecord} for this player. If you want
     * to create an empty builder for this player, use {@link #newBuilder()} method.
     *
     * @param builder the new builder
     */

    void setDisguiseBuilder(PlayerHynickRecord builder);

    /**
     * This method creates a new {@link PlayerHynickRecord} for this player.
     */

    void newBuilder();

    /**
     * This method returns the {@link HynickRecord} which is still in its
     * build state. Once this builder is fully complete, this method will be set to null,
     * and will become {@link #getDisguise()}.
     *
     * @return the builder
     */

    PlayerHynickRecord getBuilder();

    /**
     * This method sets the current disguise for this player.
     */

    void setDisguise(HynickRecord disguise);

    /**
     * This method returns the current {@link HynickRecord disguise.}
     *
     * <p>
     * Do note that this method may return null, depending on if the disguise
     * is still active.
     *
     * @return the disguise
     */

    HynickRecord getDisguise();

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

    Player bukkit();

}
