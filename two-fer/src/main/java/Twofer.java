class Twofer {
    /**
     * Two-fer or 2-fer is short for two for one. One for you and one for me.
     *
     * Given a name, return a string with the message:
     *
     * One for X, one for me.
     * Where X is the given name.
     *
     * However, if the name is missing, return the string:
     *
     * One for you, one for me.
     * Here are some examples:
     *
     * Name	    String to return
     * Alice	  One for Alice, one for me.
     * Bob	    One for Bob, one for me.
     *          One for you, one for me.
     * Zaphod	  One for Zaphod, one for me.
     *
     * @param name
     * @return
     */

    String twofer(String name) {
        String output = "One for %s, one for me.";
        if (name == null) {
            return String.format(output, "you");
        } else {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            return String.format(output, name);
        }
    }
}
