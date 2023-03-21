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

package net.pinger.hynick.factory;

import net.pinger.hynick.book.internal.InternalBookPage;
import net.pinger.hynick.book.BookPage;
import net.pinger.hynick.view.internal.InternalBookView;

public interface BookFactory {

    /**
     * This method loads all {@link BookPage pages} located under the pages.json
     * file.
     *
     * <p>
     * If the file doesn't exist, default pages will be loaded instead.
     */

    void loadPages();

    /**
     * This method saves the default page ({@link InternalBookPage page}) to the pages.json
     * file.
     *
     * <p>
     * This method is only used if this file doesn't exist currently.
     */

    void saveDefaultPages();

    /**
     * This method returns the {@link InternalBookView simplified view} of
     * the default pages.
     *
     * @return the simplified view
     */

    InternalBookView getSimplifiedView();

}
