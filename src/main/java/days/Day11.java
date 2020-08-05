package days;
import java.util.Scanner;

/**
 * 
 * @author mayur
 * 
 * Given a  2D Array, A:
 * 
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 
 * We define an hour-glass in A to be a subset of values with indices 
 * falling in this pattern in A's graphical representation:
 * 
 * a b c
 *   d
 * e f g
 * 
 * 
 * There are 16 hour-glasses in A, and an hour-glass sum is the 
 * sum of an hour-glass' values.
 * 
 * Task
 * 
 * Calculate the hour-glass sum for every hour-glass in A, 
 * then print the maximum hour-glass sum.
 * 
 * Input Format
 * 
 * There are  lines of input, where each line contains 6 space-separated 
 * integers describing 2D Array A; every value in A will be 
 * in the inclusive range of -9 to 9.
 * 
 * Constraints
 * 
 * -9 <= A[i][j] <= 9
 * 0 < i, j <= 5
 * 
 * Output Format
 * 
 * Print the largest (maximum) hour-glass sum found in A.
 */

public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 4; j++) {
//        		top         		
        		sum += arr[i][j] + arr[i][j+1] + arr[i][j+2];
//        		middle 
        		sum += arr[i+1][j+1];
//        		bottom 
        		sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
        		
        		if(sum > max) max = sum;
        		sum = 0;
        	}
        }
        
        System.out.println(max);
    }
}
