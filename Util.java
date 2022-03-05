package com.company.MyGenericStack;

public class Util {

    public static boolean isBalanced(String input) {

        MyStack<Character> myStack = new MyStack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(' || c == '{' || c == '[')
                myStack.push(c);
            else {

                if (myStack.isEmpty())//}}]])) oldugu zaman alinmiyor ve
                    return false;
                else {
                    char topVal = myStack.pop();

                    if (c == ')' && topVal != '(')
                        return false;
                    else if (c == ']' && topVal != '[')
                        return false;
                    else if (c == '}' && topVal != '{')
                        return false;
                }

            }

        }
        if (!myStack.isEmpty())//[[
            return false;
        else
            return true;
    }

}
