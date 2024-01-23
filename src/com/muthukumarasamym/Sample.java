package com.muthukumarasamym;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sample {
	public static Scanner mc = new Scanner(System.in);

	public static void main(String[] args) {
		String packagePath = "src/com/muthukumarasamym";

		List<String> subpackage = new ArrayList<String>();

		listInnerPackages(packagePath, "", subpackage);

		getClasses(subpackage, packagePath);
	}

	public static void getClasses(List<String> subpackage, String packagePath) {

		int k = 0;
		do {

			printpackage(subpackage);
			System.out.println("enter the number of package to access");
			int n = mc.nextInt();
			List<String> classNames = new ArrayList<String>();
			String s = subpackage.get(n - 1);
			listClassesInPackage(packagePath, s, classNames);
			printclasses(classNames);

			System.out.println("Number  of class you want to access" + "\n");
			String str = classNames.get(mc.nextInt() - 1);
			try {
				invokeMethodForClass(s, str);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n" + "enter 0 to exit ");
			k = mc.nextInt();
		} while (k != 0);
		System.out.println("exited");
	}

	public static void printpackage(List<String> subpackage) {
		int i = 1;
		System.out.println("packages present " + "= " + subpackage.size());
		for (String s : subpackage) {
			System.out.println(i++ + " - " + s);
		}
		System.out.println();
	}

	public static void printclasses(List<String> classNames) {
		Collections.sort(classNames);
		int i = 1;
		for (String className : classNames) {
			System.out.println(i++ + " - " + className);

		}
		System.out.println();

	}

	public static void listInnerPackages(String basePackage, String currentPackage, List<String> subpackage) {

		File packageDir = new File(basePackage + "/" + currentPackage);

		for (File file : packageDir.listFiles()) {
			if (file.isDirectory()) {
				String innerPackageName = file.getName();
				subpackage.add(innerPackageName);
			}
		}
	}

	public static void listClassesInPackage(String packagePath, String packageName, List<String> classNames) {

		File packageDir = new File(packagePath + "/" + packageName);

		File[] classFiles = packageDir.listFiles();
		System.out.println("Number of classes present : " + classFiles.length);

		for (File classFile : classFiles) {
			String className = classFile.getName().replace(".java", "");
			classNames.add(className);
		}
	}

	public static void invokeMethodForClass(String packageName, String className) throws Exception {

		String fullClassName = "com.muthukumarasamym." + packageName + "." + className;
		Class<?> clazz = Class.forName(fullClassName);
		Method mainMethod = clazz.getMethod("main", String[].class);

		mainMethod.invoke(null, (Object) null);
	}

}
