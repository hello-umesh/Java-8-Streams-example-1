package com;

public class Sample {

	public static void test(Object object) {
		System.out.println("Its object ");
	}

	public static void test(String object) {
		System.out.println("Its string ");
	}

	public static void main(String[] args) {

		String s = null;
		test(null);
		
		String input = "acaaabbbacdddd";
		char[] ch = input.toCharArray();
		StringBuilder str = new StringBuilder();
		

		for(int i=0; i<ch.length-1 ; i++ ) {
			char counter = ch[i];
		   
		     if( counter != ch[i+1]) 
			 str = str.append(ch[i]);			 
		}
		System.out.println(str);
		
		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.println(x);
		
		System.out.println("E-Learning Company" + 100 + 100 + "Simplilearn");
		
		 System.out.println(10 * 20 + "Javatpoint");   
	     System.out.println("Javatpoint" + 10 * 20);  
		
		
	}
}