#include <iostream>
#include <string>
#include <stack>
using namespace std;

// TO RUN -> From command line in the directory of this file, enter "g++ LC-151-ReverseWordsInAString-Stack.cpp"


/*
APPROACH -> Add the words in the string to a stack
O(N) Space & Time  
*/

string solution(string s) {
    stack<string> stk;
    string temp = "";

    // Fill the stack 
    for (int i = 0; i < s.size(); i++) {
        if (s[i] != ' ') 
            temp.push_back(s[i]);
        if ((i == s.size()-1 || s[i] == ' ') && !temp.empty()) 
            stk.push(temp), temp = "";
    }

    // Empty the stack into the string, then delete the exra apace at the end
    while (!stk.empty()) {
        temp.append(stk.top());
        stk.pop();
        temp.push_back(' ');
    }
    temp.pop_back();

    return temp;

}


int main() {
    cout << solution("The sky is blue");
}