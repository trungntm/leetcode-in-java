package com.trungtmnguyen;

import java.util.Stack;

public class Solutions {

  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();
    if (s.length() % 2 != 0) {
      return false;
    }

    if (s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) {
      return false;
    }

    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      }

      if (stack.isEmpty()) {
        return false;
      }

      if (c == ')') {
        char openThese= stack.pop();
        if (openThese != '(') {
          return false;
        }
      }

      if (c == ']') {
        char openThese= stack.pop();
        if (openThese != '[') {
          return false;
        }
      }

      if (c == '}') {
        char openThese= stack.pop();
        if (openThese != '{') {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
