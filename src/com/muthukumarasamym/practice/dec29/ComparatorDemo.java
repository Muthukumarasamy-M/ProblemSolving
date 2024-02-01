package com.muthukumarasamym.practice.dec29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("mtu", "asdfs", "wrwerfff", "1212", "sdffeedccd", "cdd");
		ComparatorDemo c = new ComparatorDemo();
		c.find(str);
	}

	private void find(List<String> str) {

		Comparator<String> com = (o1, o2) -> o1.length() < o2.length() ? -1 : 1;
		Collections.sort(str, com);
		System.out.println(str);
	}

}
