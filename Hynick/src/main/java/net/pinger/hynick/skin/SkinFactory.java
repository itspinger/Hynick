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

package net.pinger.hynick.skin;

import net.pinger.disguise.Skin;
import net.pinger.hynick.exception.DownloadFailedException;
import net.pinger.hynick.exception.SaveFailedException;

import javax.annotation.Nullable;

/**
 * Represents a factory for all skins. These skins will be saved both locally,
 * and to a database, depending on whether the user is currently using the database.
 *
 * @author itspinger
 * @since 1.0
 */

public interface SkinFactory {

    /**
     * This method returns a random {@link Skin} picked
     * from all cached skin packs.
     * <p>
     * In case no skin packs are cached, and therefore no cached skins exist,
     * this method will return null.
     *
     * @return a {@link Skin} if it can be found
     */

    @Nullable
    Skin getRandomSkin();

    /**
     * This method is used to download the skin packs from both
     * the local machine and a database where base skins are located.
     * <p>
     * The link for viewing the base <a href="https://github.com/itspinger/Skins/tree/master/SkinPacks">skins</a>
     *
     * @throws DownloadFailedException if an error occurred while downloading these skins
     */

    void downloadSkins() throws DownloadFailedException;

    /**
     * This method is used to save currently cached skins
     * into the local machine.
     *
     * @throws SaveFailedException if an error occurred while saving these skins
     */

    void saveSkins() throws SaveFailedException;

}

