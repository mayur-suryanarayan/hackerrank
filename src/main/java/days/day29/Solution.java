package days.day29;

import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int testcases[][];
    	
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        testcases = new int[t][2];
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            testcases[tItr][0] = n;
            testcases[tItr][1] = k;
            
        }

        scanner.close();
        
        for(int rowCounter = 0; rowCounter<testcases.length;rowCounter++) {
        	int arrayLength = testcases[rowCounter][0];
        	if(arrayLength > 2) {
	        	int temp[] = new int[arrayLength];
	        	int compare = testcases[rowCounter][1];
	        	for(int i=0;i<temp.length;i++) {temp[i]=i+1;}
	        	int max = 0;
	        	for(int j=0; j<temp.length;j++) {
	        		for(int l=j;l<temp.length;l++) {
	        			int bitWiseAnd = temp[j]&temp[l];
	        			if(bitWiseAnd>max && bitWiseAnd < compare) {
	        				max = bitWiseAnd;
	        			}
	        		}
	        	}
	        	System.out.println(max);
        	}else {
        		System.out.println(0);
        	}
        }
    }
}

