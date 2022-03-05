package com.company.MyGenericStack;

import com.company.Mystack;

public class Main {
    public static void main(String[] args) {
        /*
        input
        * {}()
          ({()})
          {}(
          []
        *
        output
        true
        true
        false
        true
        /*Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
          Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
          Given a string, determine if it is balanced or not.*/

        String[] strings = new String[]{"{}()", "({()})", "{}(", "[]"};

        for (int i = 0; i < strings.length; i++)
            System.out.println(Util.isBalanced(strings[i]));

    }
}
