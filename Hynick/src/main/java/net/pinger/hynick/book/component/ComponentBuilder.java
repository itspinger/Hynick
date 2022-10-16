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

package net.pinger.hynick.book.component;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class ComponentBuilder {

    // Empty component
    private final BookComponent component = new BookComponent("");

    /**
     * This method sets the text of the {@link #component component}.
     *
     * @param text the text to set
     * @return this instance
     */

    public ComponentBuilder text(String text) {
        this.component.setText(text);
        return this;
    }

    /**
     * This method sets whether the component built will be clickable or not.
     *
     * @param clickable whether the component will be clickable
     * @return this instance
     */

    public ComponentBuilder clickable(boolean clickable) {
        this.component.setClickable(clickable);
        return this;
    }

    /**
     * This method sets a {@link ClickEvent} for this component.
     *
     * @param action the action
     * @param text the text with the action
     * @return this builder
     */

    public ComponentBuilder click(ClickEvent.Action action, String text) {
        this.component.setClickEvent(new ClickEvent(action, text));
        return this;
    }

    /**
     * This method sets a {@link ClickEvent.Action#RUN_COMMAND run command}
     * action with the specified text. If you instead need another action ran,
     * when the command is clicked, you can use {@link #click(ClickEvent.Action, String)}.
     *
     * @param text the text
     * @return this builder
     */

    public ComponentBuilder click(String text) {
        return this.click(ClickEvent.Action.RUN_COMMAND, text);
    }

    /**
     * This method sets a new {@link HoverEvent} for the {@link #component component}.
     *
     * @param action the hover action
     * @param text the text to set
     * @return this instance
     */

    public ComponentBuilder hover(HoverEvent.Action action, String text) {
        this.component.setHoverEvent(new HoverEvent(action, new TextComponent[] { new TextComponent(text) }));
        return this;
    }

    /**
     * This method creates a new {@link HoverEvent.Action#SHOW_TEXT show text} action
     * with the specified text.
     *
     * @param text the text to show with this hover
     * @return this instance
     */

    public ComponentBuilder hover(String text) {
        return this.hover(HoverEvent.Action.SHOW_TEXT, text);
    }

    /**
     * This method returns the result instance of this builder.
     *
     * @return the result
     */

    public BookComponent build() {
        return this.component;
    }
}