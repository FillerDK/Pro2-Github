package ex4;

public class PostfixEvaluator<E> {
    /**
     * Returns the value of a postfix expression used as input.
     * Throw RuntimeException, if input is not a valid postfix expression.
     */
    public int evaluate(String input) {
        ListStack24V<Integer> stack = new ListStack24V<>();
        String[] nums = input.split("\\ ");
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (Character.isDigit(nums[i].charAt(0))) {
                stack.push(Integer.parseInt(nums[i]));
            }
            else {
                if (stack.size() > 1) {
                    int last = stack.pop();
                    int first = stack.pop();
                    if (nums[i].equals("+"))
                        first += last;
                    else if (nums[i].equals("-"))
                        first -= last;
                    else if (nums[i].equals("*"))
                        first *= last;
                    else if (nums[i].equals("/"))
                        first /= last;
                    else throw new RuntimeException();
                    stack.push(first);
                } else {
                    throw new RuntimeException();
                }
            }
        }

        if (stack.size() != 1) throw new RuntimeException();

        return stack.pop();
    }
}
