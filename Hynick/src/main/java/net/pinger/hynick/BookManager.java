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

package net.pinger.hynick;

import net.pinger.hynick.book.Book;
import net.pinger.hynick.factory.BookFactory;
import net.pinger.hynick.player.HynickPlayer;
import net.pinger.hynick.view.BookView;
import net.pinger.hynick.book.BookPage;
import net.pinger.hynick.view.HynickBookView;

import java.util.UUID;

public interface BookManager {

    /**
     * This method creates an empty {@link BookView view}.
     *
     * <p>
     * The view won't have any pages, and those will have to be added
     * from {@link BookView#addBook(Book)}
     *
     * @return the empty view
     */

    BookView createEmptyView(HynickPlayer player);

    /**
     * This method returns the factory where all {@link BookPage pages are added}
     *
     * @return the factory
     */

    BookFactory getFactory();

    /**
     * This method creates a new view for this player and opens it.
     * <p>
     * The view created is a {@link HynickBookView view type}.
     *
     * @param player the player to apply the view to
     */

    void applyView(HynickPlayer player);

    /**
     * This method opens a {@link Book book} with the id equivalent to the
     * id specified in the parameters.
     *
     * @param player the player to open the book for
     * @param id the id of the player
     * @return true if the operation went successful, false if otherwise.
     */

    boolean openBook(HynickPlayer player, UUID id);


}
