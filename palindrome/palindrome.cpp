#include <iostream>
#include <cstring>
#include <string>
using namespace std;

bool isPalindrome (string str) {
    const int length = str.length();
    
    if (length == 1) {
        return true;
    }

    char* char_array = new char[length + 1];

    strcpy(char_array, str.c_str());

    int i = 0;
    int j = length - 1; // start from 0

    while (i <= j) {
        if (char_array[i] != char_array[j]) {
            return false;
        }
        i++; j--;
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