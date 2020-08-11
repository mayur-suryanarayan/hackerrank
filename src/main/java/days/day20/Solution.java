package days.day20;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();

        int numSwaps = 0;
        int firstElement = 0;
        int lastElement = 0;
        int temp = 0;
        for(int j=0; j<n;j++) {
	        for(int i=0;i<a.length;i++) {
	        	if(i+1 != a.length) {
		        	if(a[i] > a[i+1]) {
		        		temp = a[i+1];
		        		a[i+1] = a[i];
		        		a[i] = temp;
		        		numSwaps++;
		        		
		        	}
	        	}
	        }
        }
        
        firstElement = a[0];
        lastElement = a[a.length-1];
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
        
        
    }
    
}
