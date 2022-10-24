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

package net.pinger.hynick.book;


import net.pinger.hynick.book.simplified.SimplifiedBookPage;
import net.pinger.hynick.view.BookView;

import javax.annotation.Nonnull;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractBook implements Book {

    protected final List<BookPage> pages = new LinkedList<>();
    protected final SimplifiedBookPage page;
    protected final BookView view;
    private final UUID id = UUID.randomUUID();
    private boolean viewed = false;

    /**
     * This constructor creates a {@link AbstractBook book} from the
     * {@link SimplifiedBookPage} loaded from the pages.json file.
     *
     * <p>
     * This makes it easier for localization of books.
     * @see SimplifiedBookPage
     *
     * @param simplifiedPage the simplified page
     */

    protected AbstractBook(BookView view, SimplifiedBookPage simplifiedPage) {
        this.view = view;
        this.page = simplifiedPage;
    }

    /**
     * This method returns the {@link SimplifiedBookPage simplified page}
     * loaded from the pages.json file.
     *
     * @return the simplified page
     */

    public SimplifiedBookPage getPage() {
        return page;
    }

    /**
     * This method builds this book. It is called instantly when the instance
     * of this object is created.
     *
     * @see AbstractBook
     * @see Book
     */

    public abstract void build();

    @Override
    public boolean isViewed() {
        return viewed;
    }

    @Override
    public void setViewed(boolean viewed) {
        if (this.viewed) {
            return;
        }

        this.viewed = viewed;
    }

    @Override
    public BookPage getPage(int page) {
        return this.pages.get(page - 1);
    }

    @Override
    public int getPageCount() {
        return this.pages.size();
    }

    @Override
    public List<BookPage> getPages() {
        return this.pages;
    }

    @Override
    public BookView getView() {
        return this.view;
    }

    @Nonnull
    @Override
    public String getTitle() {
        return "N/A";
    }

    @Override
    public UUID getId() {
        return this.id;
    }
}

