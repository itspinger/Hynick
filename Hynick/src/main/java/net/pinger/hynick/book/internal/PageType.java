package net.pinger.hynick.book.internal;

public enum PageType {

        /**
         * The first page to get displayed to the player when the book is opened.
         */

        DEFAULT,

        /**
         * The rank page where the player gets to choose the rank they want
         * to have.
         * <p>
         * The standard (original) page consists of different 5 different ranks:
         * <ol>
         *
         * </ol>
         */

        RANK,

        /**
         * The skin page where the player gets to choose between a:
         * <ul>
         *    <li>default skin (the default player skin)</li>
         *    <li>alex/steve skin (which consists of 9 default minecraft skins)</li>
         *    <li>random skin</li>
         *    <li>previous skin</li>
         * </ul>
         * <p>
         * The previous skin is only available in the current cache,
         * which resets when the player leaves the server. (assuming
         * that the database is not used, otherwise all of this doesn't
         * take effect, and is always used)
         */

        SKIN,

        /**
         * The name page where the player gets to choose between a:
         * <ul>
         *     <li>random name</li>
         *     <li>previously used name</li>
         * </ul>
         * <p>
         * The previous name is only available in the current cache,
         * which resets when the player leaves the server. (assuming
         * that the database is not used, otherwise all of this doesn't
         * take effect, and is always used)
         */

        NAME,

        /**
         * The page where a player can retry new names until they get to a
         * name they like. This is only called if the random name is used
         * in the step above. Otherwise, the finish page is opened.
         */

        RETRY_NAME,

        /**
         * The last page where the player is already assigned their nick, rank and skin.
         */

        FINISH

}
