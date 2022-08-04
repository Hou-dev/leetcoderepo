#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        int randsome_array[26] = {0};
        int magazine_array[26] = {0};
        for(auto c : ransomNote) {
            randsome_array[c - 'a']++;
        }
            
        for(auto c : magazine){
            magazine_array[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(randsome_array[i] > magazine_array[i]){
                return false;
            }
        } 
        return true;    
    }
};

int main(){
    Solution solution;
    cout << solution.canConstruct("aa", "aab");

    return 0;
}