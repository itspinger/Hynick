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

package net.pinger.hynick.view;

import net.pinger.hynick.view.simplified.SimplifiedBookView;

public abstract class AbstractBookView implements HynickBookView {

    protected final SimplifiedBookView simplifiedView;

    /**
     * This method creates a new {@link BookView} with the specified
     * {@link SimplifiedBookView simplified book view} to generate the default pages
     * from.
     *
     * @param simplifiedView the simplified view
     */

    protected AbstractBookView(SimplifiedBookView simplifiedView) {
        this.simplifiedView = simplifiedView;
    }

    /**
     * This method returns the {@link SimplifiedBookView simplified view}
     * for generating default pages.
     *
     * @return the default pages
     */

    public SimplifiedBookView getSimplifiedView() {
        return simplifiedView;
    }
}
