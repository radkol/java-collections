package com.primeholding.collections;

import org.apache.commons.lang3.StringUtils;

public class Print {

	public static void heading(String message) {
		System.out.println("## " + StringUtils.capitalize(message).trim());
	}
	
	public static void object(Object o) {
		System.out.println(o);
	}
	
	public static void objectSameLine(Object o) {
		System.out.print(o);
	}
	
	public static void empty() {
		System.out.println();
	}
}
