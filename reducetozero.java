// Given an integer num, return the number of steps to reduce it to zero.
// In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it

class Solution {
    public int numberOfSteps(int num) {
        int divident = num;
        int steps = 0;
        for (int i = 0; i < num ; i++){
            if(divident == 0){
                break;
            }
            else if(divident % 2 == 0 ){
                steps += 1;
                divident = divident/2;
            }
            else if (divident % 2 == 1){
                divident = divident - 1;
                steps += 1;
            }
        }
        return steps;
    }
}