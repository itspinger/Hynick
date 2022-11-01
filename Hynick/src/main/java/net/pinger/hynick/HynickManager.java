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

import net.pinger.hynick.player.HynickPlayer;
import org.bukkit.entity.Player;

public interface HynickManager {

    /**
     * This method is used to update the player's rank, name and skin by specifying
     * the current record of the player.
     * <p>
     * Do note that this method will throw an exception if any of the needed
     * properties are null.
     *
     * @param record the record of the player
     */

    void updatePlayerFromRecord(HynickRecord record);

    /**
     * This method updates all player properties and creates an empty builder
     * for the specified player. If you instead have a {@link HynickRecord}
     * which you need to update for the player, use {@link #updatePlayerFromRecord(HynickRecord)}
     * for that purpose.
     *
     * @param player the player to update
     */

    default void updatePlayerFromRecord(HynickPlayer player) {
        this.updatePlayerFromRecord(player.getBuilder());
    }

    /**
     * This method is used to reset the current record of the given player.
     *
     * @param player the player to reset the record for
     */

    void resetPlayerRecord(HynickPlayer player);

    /**
     * This method changes the name of the specified player. We accomplish
     * this by using the DisguiseAPI.
     *
     * @param player the player to change the name for
     * @param name the name to set for this player
     */

    void changeName(Player player, String name);


}
