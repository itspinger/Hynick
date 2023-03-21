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

package net.pinger.hynick.view;

import net.pinger.hynick.book.AbstractBook;
import net.pinger.hynick.book.Book;
import net.pinger.hynick.player.HynickPlayer;
import net.pinger.hynick.view.internal.InternalBookView;

import java.util.Iterator;
import java.util.List;

/**
 * Represents a view of multiple {@link Book books}. Useful for taking advantage
 * of spigot's book system.
 *
 * <p>
 * We mainly use it for opening another book from the {@link BookView view} the book is in.
 * <pre>
 *     BookView view;
 *     TextComponent component = new TextComponent("Click me to go to the next book?");
 *     component.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/book open " + view.next().getId());
 * </pre>
 *
 * @author Pinger
 * @since 1.0.0
 */

public interface BookView {

    /**
     * This method returns a {@link Book} located at the specified index.
     *
     * @param index the index
     * @return the book at the index
     */

    Book getBook(int index);

    /**
     * This method returns the {@link HynickPlayer} player using view.
     *
     * @return the player using this view
     */

    HynickPlayer getPlayer();

    /**
     * This method returns all {@link Book books} this view
     * contains.
     *
     * @return books this view contains
     */

    List<AbstractBook> getBooks();

    /**
     * This method returns the {@link InternalBookView} binded
     * with this {@link BookView}.
     *
     * @return the internal view
     */

    InternalBookView getInternalView();

}
