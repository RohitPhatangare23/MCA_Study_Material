#include<iostream>
#include<stack>
using namespace std;

int evaluatePostfix(string postfix) {
    stack<int> s;
    for(int i = 0; i < postfix.length(); i++) {
        
        if(postfix[i]>='0' && postfix[i]<='9'){
        	s.push(postfix[i]-'0');
		}
		 else {
            int operand2 = s.top();
			 s.pop();
            int operand1 = s.top(); 
			s.pop();
            switch(postfix[i])
			 {
                case '+': s.push(operand1 + operand2);
				 break;
                case '-': s.push(operand1 - operand2);
				 break;
                case '*': s.push(operand1 * operand2);
				 break;
                case '/': s.push(operand1 / operand2); 
				 break;
				 
				 default:
				 	break;
             }
        }
    }
    return s.top();
}

int main() {
    string postfix;
    cout << "Enter postfix expression (single-digit operands): ";
    cin >> postfix;
    int result = evaluatePostfix(postfix);
    cout << "Evaluation result: " << result << endl;
    return 0;
}
