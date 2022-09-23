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

package net.pinger.hynick.book;

import net.pinger.hynick.view.BookView;

import javax.annotation.Nonnull;

import java.util.List;
import java.util.UUID;

public interface Book {

    /**
     * This method returns the main title of this book, and it should never be null.
     *
     * @return the title of this book
     */

    @Nonnull
    String getTitle();

    /**
     * This method returns the view this book is in.
     *
     * @see BookView
     * @return the view
     */

    BookView getView();

    /**
     * This method returns the {@link BookPage page} at the specified index.
     * <p>
     * If the specified index is an invalid one: less than 1 or more than the amount from {@link #getPageCount()} ()},
     * this method will throw a {@link IllegalArgumentException}.
     *
     * @throws IllegalArgumentException if the page is out of bounds.
     * @param page the index to access the page at
     * @return the page
     */

    BookPage getPage(int page);

    /**
     * This method returns a number of pages contained
     * within this book, or 0 if there are no pages instantiated.
     *
     * <p>
     * It is very likely that this method will return 1,
     * except for the page where you are selecting your rank.
     *
     * @return the amount of pages within this book
     */

    int getPageCount();

    /**
     * This method returns a list of all {@link BookPage pages} within this book.
     *
     * @return the pages within this book
     */

    List<BookPage> getPages();

    /**
     * This method returns the unique identifier of this book, which
     * is used when determining which book to open for a player.
     *
     * <p>
     * Different book instances are created for each player, so their id
     * will never match.
     *
     * @return the id of the book
     */

    default UUID getId() {
        return UUID.randomUUID();
    }

    /**
     * Returns the default author of each book. We need this in order to open
     * each book, so this one is the default value.
     *
     * @return the author
     */

    @Nonnull
    default String getAuthor() {
        return "Pinger";
    }

}
