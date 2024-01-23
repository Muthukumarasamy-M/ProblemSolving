package com.muthukumarasamym.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CheckCharacter {

	public static void main(String[] args) {
		String s[]= {"abs","oooo","aaa","jij"};
		char c='a';
		System.out.println(check(s,c));
	}

	private static List<Integer> check(String[] words, char x) {
		List<Integer> list= new ArrayList<>();
		String k=""+x;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].contains(k))
				list.add(i);
		}
		return list;
		
	}
	

}
