class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char e : s.toCharArray()) {
            if (e == '(' || e == '{' || e == '[') {
                stack.add(e);
            } else if (e == ')') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (top == '(') {
                    continue;
                } else {
                    return false;
                }
            } else if (e == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (top == '{') {
                    continue;
                } else {
                    return false;
                }
            } else if (e == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (top == '[') {
                    continue;
                } else {
                    return false;
                }
            }    
        }
        return stack.isEmpty();
    }
}