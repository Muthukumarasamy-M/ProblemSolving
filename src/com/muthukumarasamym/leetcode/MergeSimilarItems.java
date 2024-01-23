package com.muthukumarasamym.leetcode;

import java.util.*;

public class MergeSimilarItems {

	public static void main(String[] args) {

		int items1[][] = { { 1, 2 }, { 2, 4 } };
		int items2[][] = { { 7, 4 }, { 1, 6 }, { 2, 3 } };
		mergeSimilarItems(items1, items2);
		mergeSimilarItems2(items1, items2);

	}

	private static void mergeSimilarItems2(int[][] items1, int[][] items2) {
		TreeMap<Integer,Integer> map= new TreeMap<>();
		
		for(int[]i:items1)
			map.put(i[0], i[1]);
		
		for(int[]i:items2)
			map.put(i[0], i[1]+map.getOrDefault(i[0], 0));
		
		List<List<Integer>> ab=new ArrayList<>();
		for(Map.Entry<Integer, Integer> k:map.entrySet())
		{
			ab.add(new ArrayList<Integer>(Arrays.asList(k.getKey(),k.getValue())));
		}
		printList(ab);	
	}

	public static void mergeSimilarItems(int[][] items1, int[][] items2) {

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < items1.length; i++) {
			List<Integer> k = new ArrayList<>();
			k.add(items1[i][0]);
			k.add(items1[i][1]);
			list.add(k);
		}
		for (int i = 0; i < items2.length; i++) {
			int n = items2[i][0];
			boolean b = false;
			for (int a = 0; a < list.size(); a++) {

				int p = list.get(a).get(0);

				if (n == p) {
					List<Integer> m = list.get(a);
					int l = items2[i][1];
					int u = list.get(a).get(1);
					m.set(1, u + l);
					list.set(a, m);
					b = true;
				}
			}
			if (b == false) {
				List<Integer> k = new ArrayList<>();
				k.add(items2[i][0]);
				k.add(items2[i][1]);
				list.add(k);
			}

		}
		Collections.sort(list, (a, b) -> a.get(0) - b.get(0));
		printList(list);

	}

	private static void printList(List<List<Integer>> list) {

		Iterator eachListIterator = list.iterator();
		while (eachListIterator.hasNext()) {

			System.out.print("  " + eachListIterator.next());
		}
		System.out.println();

	}
}
