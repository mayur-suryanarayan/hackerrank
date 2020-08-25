package days.day25;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int number = 0;
		while (T-- > 0) {
			number = sc.nextInt();
			display(number);
		}
		sc.close();
	}
	
	public static void display(int number) {
		
		String outcome = "Prime";
		if(number == 0 || number == 1) {
			outcome = "Not prime";
		}else if(number == 2 || number == 3 || number == 5 || number == 7){
			outcome = "Prime";
		}else {
			double sq = Math.sqrt(number);
			for(int i=3;i<=sq;i+=2) {
				if(number%i==0) {
					outcome = "Not prime";
					break;
				}
			}
		}
		
		System.out.println(outcome);
			
	}

}
