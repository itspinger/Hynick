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

import net.md_5.bungee.api.chat.TextComponent;
import net.pinger.hynick.book.component.BookComponent;

import javax.annotation.Nonnull;
import java.util.List;

public interface BookPage {

    /**
     * This method adds defined components to the {@link BookPage} book page.
     *
     * @param components adds components to this page
     */

    void addComponent(BookComponent... components);

    /**
     * This method returns {@link BookComponent components} that contain
     * the raw data of this page.
     *
     * @return the component
     */

    @Nonnull
    BookComponent[] getComponents();

    /**
     * This method transforms the {@link BookComponent components} to
     * {@link TextComponent text} components.
     *
     * @return the text components
     */

    TextComponent[] getAsTextComponents();

    /**
     * This method returns list of all components within this page,
     * collected within a {@link List list}.
     *
     * @return the list of all components
     */

    List<BookComponent> getComponentsAsList();

}
