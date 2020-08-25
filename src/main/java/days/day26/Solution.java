package days.day26;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>(); 
		for (int i=0; i<2; i++) {
			data.add(sc.nextLine());
		}
		sc.close();
				
		String[] date1 = data.get(0).split(" ");
		int actualYear = Integer.parseInt(date1[2]);
		int actualMonth = Integer.parseInt(date1[1]);
		int actualDay = Integer.parseInt(date1[0]);
		
		date1 = data.get(1).split(" ");
		int dueYear = Integer.parseInt(date1[2]);
		int dueMonth = Integer.parseInt(date1[1]);
		int dueDay = Integer.parseInt(date1[0]);
		
		int fine = 0;
		
		if(actualYear < dueYear) {
			fine = 0;
		}else {
			if(actualYear > dueYear) {
				fine = 10000;
			}else if(actualMonth > dueMonth) {
				fine = (500 * (actualMonth - dueMonth));
			}else if(actualMonth == dueMonth && actualDay > dueDay) {
				fine = (15 * (actualDay - dueDay));
			}
		}
		
		System.out.println(fine);
		
	}
	
}
