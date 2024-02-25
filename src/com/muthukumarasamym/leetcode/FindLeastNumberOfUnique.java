package com.muthukumarasamym.leetcode;

import java.util.Arrays;
import javafx.util.Pair;

public class FindLeastNumberOfUnique {

	public static void main(String[] args) {

	}
	    public int zoho(int[] nums) {
	        Pair<Integer, Boolean> a = new Pair<Integer, Boolean>(-1, false);
	        Pair<Integer, Boolean> b = new Pair<Integer, Boolean>(-1, false);
	        Pair<Integer, Boolean> c = new Pair<Integer, Boolean>(-1, false);

	        for (int num : nums) {
	            if ((a.getValue() && a.getKey() == num) ||
	                (b.getValue() && b.getKey() == num) ||
	                (c.getValue() && c.getKey() == num)) {
	                continue;
	            }

	            if (!a.getValue() || a.getKey() <= num) {
	                c = b;
	                b = a;
	                a = new Pair<Integer, Boolean>(num, true);
	            } else if (!b.getValue() || b.getKey() <= num) {
	                c = b;
	                b = new Pair<Integer, Boolean>(num, true);
	            } else if (!c.getValue() || c.getKey() <= num) {
	                c = new Pair<Integer, Boolean>(num, true);
	            }
	        }

	        if (c.getValue()) {
	            return a.getKey();
	        }
	        return c.getKey();
	    }
	}

}
