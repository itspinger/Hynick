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

import net.pinger.hynick.rank.Rank;
import net.pinger.hynick.skin.SkinWrapper;

public interface HynickRecord {

    /**
     * This method returns the {@link Rank rank} chosen by the player
     * and therefore saved in this wrapper.
     *
     * @return the rank
     */

    Rank getRank();

    /**
     * This method sets the {@link Rank rank} for this player.
     *
     * @param rank the rank
     */

    void setRank(Rank rank);

    /**
     * This method sets the name of this disguise.
     *
     * @param name the name
     */

    void setName(String name);

    /**
     * This method returns the name for this disguise.
     *
     * @return the name
     */

    String getName();

    /**
     * This method sets the {@link SkinWrapper skin wrapper}
     * of this disguise.
     *
     * @param wrapper the wrapper
     */

    void setSkin(SkinWrapper wrapper);

    /**
     * This method returns the {@link SkinWrapper} wrapper
     * of this disguise.
     *
     * @return the skin wrapper
     */

    SkinWrapper getSkin();

    /**
     * This method overrides whether the disguise is active.
     *
     * @param active set the active boolean
     */

    void setActive(boolean active);

    /**
     * This method returns whether this disguise is still active.
     *
     * @return whether the disguise is active
     */

    boolean isActive();

}
