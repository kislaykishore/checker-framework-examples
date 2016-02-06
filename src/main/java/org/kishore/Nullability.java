package org.kishore;

import javax.annotation.Nullable;

public class Nullability {

	public static void main(String[] args) {
		String str1 = "Hello, World!";
		printLength(str1); // no issues as val1 is not null for sure

		String str2 = System.getProperty("myStr");
		// str2 can be null

		printLength(str2); // This one doesn't compile as it can potentially
							// throw an NPE
	}

	private static void printLength(@Nullable String s) {
		if (s != null) {
			System.out.println(s.length());
		}
	}

}
