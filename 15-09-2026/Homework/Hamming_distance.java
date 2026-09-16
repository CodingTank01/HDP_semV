/*
461. Hamming Distance

The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

 

Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:

Input: x = 3, y = 1
Output: 1
 

Constraints:

0 <= x, y <= 231 - 1
*/
public class Hamming_distance {
    public int hammingDistance(int x, int y) {
        int c = 0;
        int temp = x^y;
        for(int i=0; i<32; i++){
            if((temp&1)==1) c++;
            temp>>>=1;
        }
        return c;
    }
}
