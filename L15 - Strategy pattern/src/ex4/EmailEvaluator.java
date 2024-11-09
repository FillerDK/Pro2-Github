package ex4;

public class EmailEvaluator implements Evaluator {
    /** Returns true, if the param s contains a valid email address. */
    @Override
    public boolean isValid(String s) {
        //TODO
        if (!s.contains("@"))
            return false;

        if (s.indexOf("@") != s.lastIndexOf("@"))
            return false;

        if (!isWord(s.split("@", 2)[0]))
            return false;

        return true;
    }

    /**
     * Returns true, if the param s is an acceptable word.
     * That is, s is not empty, and all letters
     * are in 'A'..'Z', 'a'..'z' or '0'..'9'.
     */
    public boolean isWord(String s) {
        for (String str : s.split(".", -1)) {
            for(char c : str.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                }
            }
        }
        return true;
    }
}
