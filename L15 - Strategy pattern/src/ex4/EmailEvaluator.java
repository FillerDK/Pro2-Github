package ex4;

public class EmailEvaluator implements Evaluator {
    /** Returns true, if the param s contains a valid email address. */
    @Override
    public boolean isValid(String s) {
        boolean valid = true;
        String[] parts = s.split("@", -1);
        if (parts.length != 2) return false;

        String[] locals = parts[0].split("\\.", -1);
        String[] domain = parts[1].split("\\.", -1);
        if (domain.length < 2) return false;

        for (int i = 0; valid && i < locals.length; i++)
            valid = isWord(locals[i]);
        for (int i = 0; valid && i < domain.length; i++)
            valid = isWord(domain[i]);

        return valid;
    }

    /**
     * Returns true, if the param s is an acceptable word.
     * That is, s is not empty, and all letters
     * are in 'A'..'Z', 'a'..'z' or '0'..'9'.
     */
    public boolean isWord(String s) {
        return s.matches("[A-Za-z0-9]+");
        /*
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
         */
    }
}
