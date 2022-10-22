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

package net.pinger.hynick.actionbar;

import org.bukkit.entity.Player;

public interface ActionbarProvider {

    /**
     * This method sends the specified player a message to the action bar,
     * located above the player's 9 slot inventory.
     *
     * @param player the player to send this bar to
     * @param message the message of this bar
     */

    void sendActionBar(Player player, String message);

    /**
     * This method clears the player's action bar by sending an empty message
     * to the server.
     *
     * @param player the player to clear the action bar for
     */

    default void clearActionBar(Player player) {
        this.sendActionBar(player, "");
    }

}
