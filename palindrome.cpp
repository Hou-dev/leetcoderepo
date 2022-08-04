#include <iostream>
#include <vector>
using namespace std;
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};
 

class Solution {
public:
    bool isPalindrome(ListNode* head) {
        int size_of_node = 0;
        vector<int> vec;
        while (head != nullptr)
        {
            vec.push_back(head->val);
            head = head->next;
        }
        size_of_node = vec.size();
        // cout<< "Size of node: " << size_of_node << "\n";
        if(size_of_node ==  1){
            return true;
        }
        if(size_of_node % 2 == 0){
            bool isPal = false;
            size_of_node = size_of_node - 1;
            for(int i = 0; i < vec.size(); i++){
                if(vec[i] == vec[size_of_node]){
                    // cout << "Vec: " << vec[i] << "\n";
                    // cout << "VecBack: " << vec[size_of_node] << "\n";
                    isPal = true;
                }
                else if(vec[i] != vec[size_of_node]){
                    isPal = false;
                    return false;
                }
                size_of_node--;
            }
            if(isPal == true){
                return true;
            }
            else{
                return false;
            }
        }
        else if(size_of_node % 2 == 1){
            bool isPalo = false;
            size_of_node--;
            for(int i = 0; i < ((vec.size() - 1)/2); i++){
                if(vec[i] == vec[size_of_node]){
                    isPalo = true;
                }
                else{
                    isPalo = false;
                    return false;
                }
                size_of_node--;
            }
            if(isPalo == true){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
};

int main(){
    Solution solution;
    ListNode * head = new ListNode;
    ListNode * second = new ListNode;
    ListNode * thrid = new ListNode;
    ListNode * fourth = new ListNode;
    head->val = 1;
    head->next = second;
    second->val = 1;
    // second->next = nullptr;
    second->next = thrid;
    thrid->val = 2;
    // thrid->next = nullptr;
    thrid->next = fourth;
    fourth->val = 1;
    fourth->next = nullptr;
    cout <<  solution.isPalindrome(head) << "\n";
    return 0;
}