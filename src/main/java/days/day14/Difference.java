package days.day14;

import java.util.ArrayList;
import java.util.Collections;

public class Difference {

	public int maximumDifference;
	private int[] elements;

	public Difference(int[] a) {
		this.elements = a;
	}

	public void computeDifference() {
		ArrayList<Integer> temp = new ArrayList<Integer>(); 
		for (int i = 0; i < elements.length; i++) {
			for (int j = i; j < elements.length; j++) {
				  temp.add(Math.abs(elements[i]-elements[j]));
			}
		}
		Collections.sort(temp);
		maximumDifference = temp.get(temp.size()-1);
	}

}
