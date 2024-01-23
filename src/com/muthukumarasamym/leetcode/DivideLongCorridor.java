package com.muthukumarasamym.leetcode;

public class DivideLongCorridor {

	public static void main(String[] args) {

		String str = "SSPPSPS";
		DivideLongCorridor d = new DivideLongCorridor();
		System.out.println(d.numberOfWays(str));

	}

	public int numberOfWays(String corridor) {

		char array[] = corridor.toCharArray();
		int chairs = 0, n = array.length;
		long result = 1;
		
		for (int i = 0; i < n; i++) {
			
			if (array[i] == 'S') {
				chairs++;

				while (++i < n && array[i] != 'S');
				
				if (i < n && array[i] == 'S')
					chairs++;
				
				int division = 1;
				
				while (++i < n && array[i] != 'S') {
					division++;
				}
				
				if (division > 1 && i < n)
					result = (result * division) % 1000000007;

				i--;
			}

		}
		
		return (chairs != 0 && chairs % 2 == 0) ? (int) result : 0;

	}

}
