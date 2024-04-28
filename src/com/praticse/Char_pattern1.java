package com.praticse;

public class Char_pattern1 {
	
	public static void pattern(int n){
		for(int i= 1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("A ");
			}
			System.out.println();
		}
		
	}public void pattern2() {
		int n=4;
		for(int i= 1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2 == 0)
				   System.out.print("B ");
				else
					System.out.print("A ");
					
			}
			System.out.println();
		}	
	}
	public static void pattern3() {
		int n=4;
		for(int i=0,k='A';i<=n;i++,k+=2) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)k+" ");
			}
			System.out.println();
		}
	}

	
	 public static void pattern4() { 
		 int n=4;
		 for(int i=1,p='A';i<=n;i++,p++) {
			 for(int j=1;j<=i;j++) {
				 System.out.print((char)p+" ");
			 }
			 System.out.println();
		 }
			 }
	  
	 
	public static void main(String[] args) {
		//without static need to create instance of a class then call method
		//Char_pattern1 ch = new Char_pattern1();
		//ch.pattern2();
		//with static just call method name
		//pattern(5);
		pattern4();
		pattern3();

	}

}
