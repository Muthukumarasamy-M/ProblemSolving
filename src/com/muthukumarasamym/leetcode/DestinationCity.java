package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {

	public static void main(String[] args) {

		List<List<String>> list = new ArrayList<>(
				List.of(List.of("London", "New York"), List.of("New York", "Lima"), List.of("Lima", "Sao Paulo")));

		DestinationCity d = new DestinationCity();
		d.destination(list);

	}

	private void destination(List<List<String>> list) {

		Set<String> set = new HashSet<>();
		for (List<String> li : list) {
			set.add(li.get(0));
		}
		for (List<String> li : list) {
			String s = li.get(1);
			if (!set.contains(s)) {
				System.out.println(s);
			}

		}
	}

}