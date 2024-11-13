package ex4;

public class NumberEvaluator implements Evaluator {
    /** Returns true, if the param s contains a valid integer or decimal number. */
    @Override
    public boolean isValid(String s) {
        try {
            double num = Double.parseDouble(s);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
