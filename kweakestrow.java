// You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
// A row i is weaker than a row j if one of the following is true:
// The number of soldiers in row i is less than the number of soldiers in row j.
// Both rows have the same number of soldiers and i < j.
// Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections; 


class Element implements Comparable<Element> {

    int index, value;

    Element(int index, int value){
        this.index = index;
        this.value = value;
    }

    public int compareTo(Element e) {
        return this.value - e.value;
    }
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int new_k [] = new int[mat.length];
        int new_q[] = new int[mat.length];
        int new_p[] = new int[k];
        int sum = 0;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){
                if(mat[row][col] == 1){
                    sum = sum + 1;
                }
            }
            new_k[row] = sum;
            sum = 0;
        }
        List<Element> elements = new ArrayList<Element>();
        for (int i = 0; i < new_k.length; i++) {
            elements.add(new Element(i, new_k[i]));
        }
        Collections.sort(elements);
        int z = 0;
        for (Element element : elements) {
            new_q[z] = element.index;
            z++;
        }
        for (int j = 0; j < k; j++){
            new_p[j] = new_q[j];
        }
        return new_p;
    }
}
