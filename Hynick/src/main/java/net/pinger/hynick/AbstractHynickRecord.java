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

import net.pinger.disguise.Skin;
import net.pinger.hynick.rank.Rank;
import net.pinger.hynick.record.HynickDisguiseRecord;

public abstract class AbstractHynickRecord implements PlayerHynickRecord {

    private final HynickRecord record;

    protected AbstractHynickRecord() {
        this.record = new HynickDisguiseRecord();
    }

    @Override
    public Rank getRank() {
        return this.record.getRank();
    }

    @Override
    public void setRank(Rank rank) {
        this.record.setRank(rank);
    }

    @Override
    public void setName(String name) {
        this.record.setName(name);
    }

    @Override
    public String getName() {
        return this.record.getName();
    }

    @Override
    public void setSkin(Skin wrapper) {
        this.record.setSkin(wrapper);
    }

    @Override
    public Skin getSkin() {
        return this.record.getSkin();
    }

    @Override
    public void setActive(boolean active) {
        this.record.setActive(active);
    }

    @Override
    public boolean isActive() {
        return this.record.isActive();
    }
}
