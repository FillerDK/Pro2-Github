package ex4;

public class EmailEvaluator implements Evaluator {
    /** Returns true, if the param s contains a valid email address. */
    @Override
    public boolean isValid(String s) {
        boolean valid = true;
        String[] words = s.split("[@\\.]", -1);

        if (!s.contains("@"))
            valid = false;
        else
            if (s.indexOf("@") != s.lastIndexOf("@"))
                valid = false;
        for (int i = 0; valid && i < words.length; i++)
            valid = isWord(words[i]);
        return valid;
    }

    /**
     * Returns true, if the param s is an acceptable word.
     * That is, s is not empty, and all letters
     * are in 'A'..'Z', 'a'..'z' or '0'..'9'.
     */
    public boolean isWord(String s) {
        boolean valid = true;
        if (s.length() == 0)
            valid = false;
        else
            for(char c : s.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    valid = false;
            }
        }
        return valid;
    }
}
