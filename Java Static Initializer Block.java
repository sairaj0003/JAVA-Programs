/*
Write a java code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.
If B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format:
There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.

Constraints
  -100<=B<=100
  -100<=H<=100
  
Output Format:
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1:
1
3

Sample output 1:
3

Sample input 2:
-1
2

Sample output 2:
java.lang.Exception: Breadth and height must be positive
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int b=x.nextInt();
        int h=x.nextInt();
        x.close();
        if(b<=0 || h<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.print(b*h);
        }
    }
}
