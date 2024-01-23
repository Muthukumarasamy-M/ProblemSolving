package com.muthukumarasamym.recursion;

public class Print1ToN {
	
	public static void main(String[] args) {

		Print1ToN p = new Print1ToN();
		p.printForward(10);
		System.out.print("forward\n\n");
		p.printBackward(10);

		System.out.print("Backward\n\n");
		p.printShuffle(3);
		System.out.print("shuffle\n\n");
		p.printShuffle2(3);
		System.out.println();
		System.out.println(p.f(50));
		System. out.println("Maharashtra".substring(2));
	}

	private void printForward(int i) {

		if (i == 0)
			return;
		printForward(i - 1);
		System.out.print(i + " ");

	}
	int f(int n) 
	{ 
		if (n==0)
		      return 0;
		  if (n%2==0)
		      return 2 + f(n-1);
		  else
		      return f(n-1);
	}

	private void printBackward(int i) {

		if (i == 0)
			return;
		System.out.print(i + " ");
		printBackward(i - 1);

	}

	private void printShuffle(int i) {

		if (i == 0)
			return;
		printShuffle(i - 1);
		System.out.print(i + " ");
		printShuffle(i - 1);

	}

	private void printShuffle2(int i) {

		if (i == 0)
			return;
		else
			printShuffle2(i - 1);
		System.out.print(i + " ");

		printShuffle2(i - 1);
		printShuffle2(i - 1);

	}

}
