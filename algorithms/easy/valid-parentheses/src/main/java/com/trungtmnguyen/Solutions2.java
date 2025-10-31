package com.trungtmnguyen;

public class Solutions2 {

  public boolean isValid(String s) {
    char[] stack = new char[s.length()];
    int top = -1;

    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack[++top] = c;
      } else {
        if (top == -1) {
          return false;
        }
        char openThese = stack[top--];
        if ((c == ')' && openThese != '(') ||
            (c == ']' && openThese != '[') ||
            (c == '}' && openThese != '{')) {
          return false;
        }
      }
    }

    return top == -1;
  }
}
