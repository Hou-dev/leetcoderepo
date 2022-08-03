// Problem: Given a roman numeral, convert it to an integer.
using namespace std;
#include <string>
#include <iostream>

class Solution {
public:
    int romanToInt(string s) {
        int sum = 0;
        for (int i = 0; i<s.length(); i++){
            if (s[i] == 'I'){
                sum += 1;
            }
            else if (s[i] == 'V')
            {
                /* code */
                sum += 5;
            }
            else if (s[i] == 'X')
            {
                /* code */
                sum += 10;
            }
            else if (s[i] == 'L')
            {
                /* code */
                sum += 50;
            }
            else if (s[i] == 'C')
            {
                /* code */
                sum += 100;
            }
            else if (s[i] == 'D')
            {
                /* code */
                sum += 500;
            }
            else if (s[i] == 'M')
            {
                /* code */
                sum += 1000;
            }
        }
        for (int j=1; j < s.length(); j++){
            if((s[j] == 'V' || s[j] == 'X') && s[j-1] == 'I'){
                sum -= 1 + 1;
            }
            if((s[j] == 'L' || s[j] == 'C') && s[j-1] == 'X'){
                sum -= 10 + 10;
            }
            if((s[j] == 'D' || s[j] == 'M') && s[j-1] == 'C'){
                sum -= 100 + 100;
            }
        }
        cout << sum;
        return 0;
    }
};

int main(){
    Solution sol;
    sol.romanToInt("LVIII");
    return 0;
}