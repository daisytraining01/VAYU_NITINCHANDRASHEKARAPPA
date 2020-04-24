package com.FIFO;

public class StrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "REST ASSURED";
		String strNew = str.substring(0, 2)+str.substring(4, str.length());
		System.out.println(strNew);
		
		
		//compare two string
		String s1 = "ASSURED";
	      String s2 = "ASSURED";
	      String s3 = new String ("REST ASSURED");
	      System.out.println(s1.equals(s2));
	      System.out.println(s2.equals(s3));
	}
	

}
