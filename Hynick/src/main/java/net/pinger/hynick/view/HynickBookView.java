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

import net.pinger.hynick.book.Book;

public interface HynickBookView extends BookView {

    /**
     * This method returns {@link Book the default book}
     * where the user confirms that they want to change their skin and nick.
     *
     * @return the default page
     */

    Book getDefaultBook();

    /**
     * This method returns {@link Book the book page}
     * where the user chooses the rank they want to be disguised with.
     *
     * <p>
     * If this player can't choose any ranks, this view will add
     * a default rank instead.
     *
     * @return the rank
     */

    Book getRankBook();

    /**
     * This method returns {@link Book the skin book}
     * where the user chooses the skin they want to be disguised with.
     *
     * @return the skin book
     */

    Book getSkinBook();

    /**
     * This method returns {@link Book the name book}
     * where the user chooses the username they want to be disguised with.
     *
     * @return the name book
     */

    Book getNameBook();

    /**
     * This method returns {@link Book the retry name book}
     * where the user can choose another name, if they didn't like the generated one.
     *
     * @return the retry page
     */

    Book getRetryNameBook();

    /**
     * This method returns {@link Book the finish book}
     * where the user finished selecting their book.
     *
     * @return the book
     */

    Book getFinishBook();

    @Override
    default void addBook(Book page) {
        throw new IllegalArgumentException("Can't add book to this view");
    }
}
