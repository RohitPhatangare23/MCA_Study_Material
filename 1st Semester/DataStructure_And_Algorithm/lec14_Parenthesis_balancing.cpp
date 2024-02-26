#include <iostream>
#include <stack>
#include <string>

using namespace std;

bool isBalanced(string expression) {
    stack<char> s;

    for (char c : expression) {
        if (c == '(' || c == '[' || c == '{') {
            s.push(c);
        } else if (c == ')' || c == ']' || c == '}') {
            if (s.empty()) {
                return false;  // Unmatched closing parenthesis
            }
            char open = s.top();
            s.pop();
            if ((c == ')' && open != '(') || (c == ']' && open != '[') || (c == '}' && open != '{')) {
                return false;  // Mismatched opening and closing parenthesis
            }
        }
    }

    return s.empty();  // True if the stack is empty (all parentheses are balanced)
}

int main() {
    string expression;
    cout << "Enter an expression with parentheses: ";
    cin >> expression;

    if (isBalanced(expression)) {
        cout << "Parentheses are balanced." << endl;
    } else {
        cout << "Parentheses are not balanced." << endl;
    }

    return 0;
}