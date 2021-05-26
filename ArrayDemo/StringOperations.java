package com.onebill.corejava.basics.ArrayDemo;

public class StringOperations {

	public static void main(String[] args) {
		String s1 = "gcvujjdncbmx";
		System.out.println("String length: "+s1.length());
		System.out.println("Print character at 3rd position: "+s1.charAt(2));
		System.out.println("Index of fun is: "+s1.indexOf("jjd"));
		System.out.println("Concatenated String: "+s1.concat("fun"));
		boolean check = "Java".equalsIgnoreCase("Java");
		System.out.println(check);
		String s3 = "            Learn Share Learn              ";
		System.out.println("Trim the word: "+s3.trim());
		System.out.println(s1.subSequence(5, 10));
		String s4 = "Java";
		String s5 = "ja";
		
		int chackThis = s4.compareTo(s5);
		
	}

}
