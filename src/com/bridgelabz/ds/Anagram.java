package com.bridgelabz.ds;

import java.util.*;

public class Anagram {
	public static void checkAnagram(String str1, String str2) {

		str1 = str1.replaceAll(" ", "");
		str2 = str2.replaceAll(" ", "");
		boolean result = true;

		if (str1.length() != str2.length()) {
			result = false;
		} else {

			char[] StringArray1 = str1.toLowerCase().toCharArray();
			char[] StringArray2 = str2.toLowerCase().toCharArray();

			Arrays.sort(StringArray1);
			Arrays.sort(StringArray2);

			result = Arrays.equals(StringArray1, StringArray2);

		}
		// if both length and the sorted list is same then they are anagrams
		if (result == true) {
			System.out.println(str1 + " and " + str2 + " are anagrams ");
		} else {

			System.out.println(str1 + " and " + str2 + " are not anagrams ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1 = scanner.next();
		System.out.println("Enter second String");
		String str2 = scanner.next();
		checkAnagram(str1, str2);

	}

}