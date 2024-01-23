package com.muthukumarasamym.leetcode;

import java.util.Stack;

public class SimplyfyPath {

	public static void main(String[] args) {
		String str = "/home/user/Documents/../../../usr/local/bin";
		SimplyfyPath s = new SimplyfyPath();
		System.out.println(s.simplifyPath(str));

	}

	public String simplifyPath(String path) {

		Stack<String> stack = new Stack<>();
		String[] directories = path.split("/");
		for (String dir : directories) {
			if (dir.equals(".") || dir.isEmpty()) {
				continue;
			} else if (dir.equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(dir);
			}
		}
		return "/" + String.join("/", stack);
	}

}
