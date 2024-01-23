package com.muthukumarasamym.practice.dec14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class details {
	String name;
	int by;
	int dy;

	details(String name, int by, int dy) {
		this.name = name;
		this.by = by;
		this.dy = dy;
	}
}

public class PersonLiving {
	public static void main(String[] args) {

		List<details> list = new ArrayList<>();
		list.add(new details("muthu", 1926, 1976));
		list.add(new details("elango", 1945, 1960));
		list.add(new details("sam", 1941, 1978));
		list.add(new details("sri", 1939, 1967));
		list.add(new details("madhan", 1965, 1998));
		list.add(new details("kumar", 1955, 1996));
		list.add(new details("surya", 1975, 1999));

		Scanner mc = new Scanner(System.in);
		System.out.println("Enter the year to search for");
		int searchyear = mc.nextInt();

		for (details detail : list) {
			if (searchyear >= detail.by && searchyear <= detail.dy)
				System.out.println("  " + detail.name + " till " + detail.dy);
		}

	}

}
