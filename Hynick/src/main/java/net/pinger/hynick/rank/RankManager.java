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

package net.pinger.hynick.rank;

import org.bukkit.entity.Player;

import java.util.List;

public interface RankManager {

    /**
     * This method returns all available ranks to the specified player.
     *
     * @param player the specified player
     * @return all available ranks
     */

    List<Rank> getAvailableRanks(Player player);

    /**
     * This method returns a {@link Rank rank} that matches
     * the specified name.
     *
     * <p>
     * If no rank {@link Rank#getName()} matches this name,
     * this method will return null.
     *
     * @param name the name of the rank
     * @return the rank if it exists, otherwise null
     */

    Rank getRank(String name);

}
