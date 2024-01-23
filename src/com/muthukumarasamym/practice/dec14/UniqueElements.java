package com.muthukumarasamym.practice.dec14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Write a Java function to remove duplicates from an ArrayList of
 * 	integers.The output should be an ArrayList containing unique elements
 * in the order they first appeared.
 */
public class UniqueElements {

	public static void main(String[] args) {

		List<Integer> list = List.of(2, 1, 5, 1, 5, 13, 3, 2, 1, 4);

		UniqueElements u = new UniqueElements();
		u.findUnique(list);

	}

	private void findUnique(List<Integer> list) {

		List<Integer> result = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		for (int num : list) {
			if (set.add(num)) {
				result.add(num);
			}
		}
		System.out.println(result);
	}

}
