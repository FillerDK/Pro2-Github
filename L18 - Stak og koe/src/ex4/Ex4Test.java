package ex4;

public class Ex4Test {
    public static void main(String[] args) {
        String input = "12 2 5 + - 4 * 2 /";

        PostfixEvaluator<String> evaluator = new PostfixEvaluator<>();

        System.out.println(evaluator.evaluate(input));
    }
}
