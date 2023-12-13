package com.muthukumarasamym.leetcode;

import java.util.TreeSet;

class student implements Comparable<student> {
	private String name;
	private int marks;

	public student(String s, int marks) {
		this.name = s;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(student otherStudent) {
		// Compare students based on marks
		return this.getName().compareTo(otherStudent.getName());
	
	}

}

public class Treesolution {
	public static void main(String[] args) {
		TreeSet<student> tree = new TreeSet<>();
		
		tree.add(new student("muthu", 40));
		System.out.println(" "+tree);
		tree.add(new student("kumar", 30));
		System.out.println(" "+tree);
		tree.add(new student("siva", 80));
		System.out.println(" "+tree);
		tree.add(new student("mydeen", 100));
		System.out.println(" "+tree);
		tree.add(new student("nat", 30));
		
		

		for (student student : tree)
			System.out.println(student.getName() + " " + student.getMarks());
	}
}