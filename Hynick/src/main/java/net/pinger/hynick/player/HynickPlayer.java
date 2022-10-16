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

import net.pinger.hynick.HynickDisguise;
import net.pinger.hynick.view.BookView;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.UUID;

public interface HynickPlayer {

    /**
     * This method sets the builder for this player.
     *
     * @param disguise the disguise builder
     */

    void setBuilder(HynickDisguise disguise);

    /**
     * This method returns the {@link HynickDisguise} which is still in its
     * build state. Once this builder is fully complete, this method will be set to null,
     * and will become {@link #getDisguise()}.
     *
     * @return the builder
     */

    HynickDisguise getBuilder();

    /**
     * This method sets the current disguise for this player.
     *
     * @return disguise the current disguise
     */

    void setDisguise(HynickDisguise disguise);

    /**
     * This method returns the current {@link HynickDisguise disguise.}
     *
     * <p>
     * Do note that this method may return null, depending on if the disguise
     * is still active.
     *
     * @return the disguise
     */

    HynickDisguise getDisguise();

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
