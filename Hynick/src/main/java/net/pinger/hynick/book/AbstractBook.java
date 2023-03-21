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


import net.pinger.hynick.book.internal.InternalBookPage;
import net.pinger.hynick.book.internal.PageType;
import net.pinger.hynick.view.BookView;
import net.pinger.hynick.view.internal.InternalBookView;

import javax.annotation.Nonnull;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractBook implements Book {

    protected final List<BookPage> pages;
    protected final InternalBookPage page;
    protected final BookView view;
    private final UUID id;
    private boolean viewed = false;

    /**
     * This constructor creates a {@link AbstractBook book} from the
     * {@link InternalBookPage} loaded from the pages.json file.
     * <p>
     * This makes it easier for localization of books.
     *
     * @param view the view
     */

    protected AbstractBook(BookView view) {
        this.view = view;
        this.page = view.getInternalView().getPage(this.getType());
        this.pages = new LinkedList<>();
        this.id = UUID.randomUUID();
    }

    /**
     * This method returns the {@link InternalBookPage simplified page}
     * loaded from the pages.json file.
     *
     * @return the simplified page
     */

    public InternalBookPage getPage() {
        return this.page;
    }

    /**
     * This method builds this book. It is called instantly when the instance
     * of this object is created.
     *
     * @see AbstractBook
     * @see Book
     */

    public abstract void build();

    /**
     * This method returns the {@link PageType} of this
     * page.
     *
     * @return the page type
     */

    public abstract PageType getType();

    @Override
    public boolean isViewed() {
        return this.viewed;
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

