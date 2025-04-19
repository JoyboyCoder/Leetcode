class Solution {
    public boolean isValid(String s) {

        int index = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '}':
                    if (index == -1 || stack[index--] != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (index == -1 || stack[index--] != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (index == -1 || stack[index--] != '(') {
                        return false;
                    }
                    break;
                default:
                    stack[++index] = ch;
                    break;
            }
        }
        return index == -1;
    }
}