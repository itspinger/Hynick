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
import net.pinger.hynick.book.BookPage;
import net.pinger.hynick.player.HynickPlayer;
import org.junit.jupiter.api.Test;

import javax.annotation.Nonnull;
import java.util.List;

class HynickBookViewTest {

    @Test
    void testAddBook() {
        HynickBookView view = new HynickBookView() {
            @Override
            public HynickPlayer getPlayer() {
                return null;
            }

            @Override
            public Book current() {
                return null;
            }

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Book next() {
                return null;
            }
        };

        // This should always throw an error
        view.addBook(new BookImpl());
    }

    /**
     * A sample implementation of a book type.
     */

    static class BookImpl implements Book {

        @Nonnull
        @Override
        public String getTitle() {
            return "";
        }

        @Override
        public BookView getView() {
            return null;
        }

        @Override
        public BookPage getPage(int page) {
            return null;
        }

        @Override
        public int getPageCount() {
            return 0;
        }

        @Override
        public List<BookPage> getPages() {
            return null;
        }
    }

}