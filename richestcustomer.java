// Problem: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

class Solution {
    public int maximumWealth(int[][] accounts) {
        int initial = 0;
        int end = 0;
        for(int row = 0; row < accounts.length; row++){
            for(int col = 0; col < accounts[row].length; col++){
                initial += accounts[row][col];
            }
            if(initial == 0){
                end = initial;
                initial = 0;
            }
            else if (initial > end){
                end  = initial;
            }
            initial = 0;
        }
        return end;
    }
}