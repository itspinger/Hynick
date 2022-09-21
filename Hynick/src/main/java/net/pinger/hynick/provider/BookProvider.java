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

package net.pinger.hynick.provider;

import net.md_5.bungee.api.chat.BaseComponent;

import net.pinger.hynick.book.Book;
import org.bukkit.entity.Player;

/**
 * This class is a type that tries to utilize reflection in order to open
 * different {@link Book books}.
 * <p>
 * It is designed this way, because prior to 1.12.2, there was no method in the api
 * that allowed opening books with different {@link BaseComponent components}, or
 * even opening books.
 * <p>
 * Opening books was introduced into the api in 1.14.2 as per
 * <a href = "https://helpch.at/docs/1.14.2/org/bukkit/entity/Player.html">this link</a>
 *
 * @author Pinger
 * @since 1.0.0
 */

public interface BookProvider {

    /**
     * This method attempts to open a {@link Book} for the specified player.
     *
     * @param player the player to open the book for
     * @param book the book to open
     */

    void openBook(Player player, Book book);

}
