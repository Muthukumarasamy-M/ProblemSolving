package com.muthukumarasamym.leetcode;

import java.util.Comparator;
import java.util.TreeSet;

class Student {
	private String name;
	private int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "name='" + name + '\'' + ", marks=" + marks + '}';
	}
}

// Custom Comparator for comparing students by marks
class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		System.out.println(student1.getMarks() + " " + student2.getMarks());
		return Integer.compare(student1.getMarks(), student2.getMarks());
	}
}

public class TreeSetWithComparator {
	public static void main(String[] args) {
		// Creating a TreeSet of Student objects with a custom comparator
		TreeSet<Student> studentSet = new TreeSet<>(new StudentComparator());

		// Adding students to the TreeSet
		System.out.println(" " + studentSet);
		studentSet.add(new Student("Alice", 85));
		System.out.println(" " + studentSet);
		studentSet.add(new Student("Bob", 83));
		System.out.println("  " + studentSet);
		studentSet.add(new Student("Charlie", 78));
		System.out.println(" " + studentSet);
		studentSet.add(new Student("David", 95));
		System.out.println("  " + studentSet);
		studentSet.add(new Student("Eve", 88));

		System.out.println("Students sorted by marks: " + studentSet);
	}
}