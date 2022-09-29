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

package net.pinger.hynick.book.simplified;

import net.pinger.hynick.book.component.BookComponent;

import java.util.List;
import java.util.Map;

public interface SimplifiedBookPage {

    /**
     * This method returns a map of components that are mandatory for this page,
     * and therefore have a specific key which flags them.
     *
     * @return the key components
     */

    Map<String, BookComponent> getKeyComponents();

    /**
     * This method returns the components that are of lower value than the {@link #getKeyComponents()}
     * method, and don't need any key that represents them.
     *
     * <p>
     * Do note that this method might be changed in the future, and implemented
     * within the
     *
     * @return the components
     */

    List<BookComponent> getComponents();

}
