#include <iostream>
#include <cstring>
#include <string>
using namespace std;

bool isPalindrome (string str, int i=0) {
    const int length = str.length();
    char* char_array = new char[length + 1];

    strcpy(char_array, str.c_str());

    if (i < length / 2) {
        int j = length - i - 1;

        if (char_array[i] != char_array[j]) {
            return false;
        }
        
        return isPalindrome(str, ++i);
    }
    
    return true;
}

void printPalindrome(string str) {
    if (isPalindrome(str)) {
        cout << "Palindrome" << endl;
    } else {
        cout << "Not Palindrome" << endl;
    }
}

int main() {
    string str;

    cin >> str;

    printPalindrome(str);

    return 0;
}