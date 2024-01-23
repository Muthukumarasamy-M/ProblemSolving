package com.muthukumarasamym.practice.dec14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Sublist Search:
Write a Java function to check if an ArrayList is a sublist of another ArrayList.
Return true if it is, and false otherwise*/

public class Sublist {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(List.of(1, 2, 23, 5, 62, 3, 18, 76));
		List<Integer> list1 = new ArrayList<>(List.of(3, 1, 2, 18));

		Sublist s = new Sublist();
		System.out.println(s.find(list, list1));

	}

	private boolean find(List<Integer> list, List<Integer> list1) {

		int size = list.size(), size1 = list1.size(), index = 0;
		if (size < size1)
			return false;
		Collections.sort(list);
		Collections.sort(list1);
		for (int i = 0; i < size; i++) {

			if (index < size1 && list.get(i).equals(list1.get(index))) {
				index++;
			}
		}
		return index == size1;

	}

}
