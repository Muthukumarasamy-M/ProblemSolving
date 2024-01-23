package com.muthukumarasamym.recursion;

public class Fibbonacci {

	public static void main(String[] args) {
		int n = 4;
		Fibbonacci f = new Fibbonacci();

		System.out.println(f.fibbo(n));
		f.fibo(n);
		int cache[]= new int[n+1];
		System.out.println("\n"+f.fibboo(n ,cache));
		

	}

	private int fibboo(int n, int[] cache) {
	
		if(n<=1)
			return n;
		if(cache[n]!=0)
			return cache[n];
		
		return cache[n]=fibboo(n-1,cache)+fibboo(n-2,cache);
	}

	private void fibo(int n) {
		int x = 0;
		int y = 1;
		System.out.print(x + " " + y);
		for (int i = 2; i <n; i++) {
			int z = x + y;
			x = y;
			y = z;
			System.out.print(" " + z);

		}
	}

	private int fibbo(int n) {

		if (n <= 1)
			return n;
		System.out.print(n);
		return  fibbo(n - 1)+fibbo(n - 2) ;
	}

	
}
