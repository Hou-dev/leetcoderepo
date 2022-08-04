// Given an integer n, return a string array answer (1-indexed) where:
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
// answer[i] == "Fizz" if i is divisible by 3.
// answer[i] == "Buzz" if i is divisible by 5.
// answer[i] == i (as a string) if none of the above conditions are true.
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList fb_a = new ArrayList();
        for(int i = 1; i < n + 1 ; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                fb_a.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                fb_a.add("Fizz");
            }
            else if(i % 5 == 0){
                fb_a.add("Buzz");
            }else{
                fb_a.add(Integer.toString(i));
            }
            
        }
        return fb_a;
    }
}