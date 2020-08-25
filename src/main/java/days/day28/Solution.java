package days.day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	HashMap<String, String> contacts = new HashMap<String, String>();
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if(emailID.endsWith("@gmail.com")) {
            	contacts.put(emailID, firstName);
            }
        }

        scanner.close();
        
        List<String> sorted = new ArrayList<String>(contacts.values());
        
        Collections.sort(sorted);
        
        for(String entry: sorted) {
        	System.out.println(entry);
        }
        
        
        
    }
}