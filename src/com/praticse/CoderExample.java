package com.praticse;

public class CoderExample {
	
	public static void pattern1() {
		String s ="CODER";
		int n=s.length();
		for(int i=1,p=0;i<=n;i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print(s.charAt(p)+" ");
			}
			System.out.println();
		}
	}
	public static void pattern2() {
		String s ="CODER";
		int n=s.length();
		for(int i=1;i<=n;i++) {
			for(int j=1,p=0;j<=i;j++,p++) {
				System.out.print(s.charAt(p)+" ");
			}
			System.out.println();
		}
	}
	public static void pattern3() {
		//R 
		//R E 
		//R E D 
		//R E D O 
		//R E D O C 

		String s ="CODER";
		int n=s.length();
		for(int i=1;i<=n;i++) {
			for(int j=1,p=4;j<=i;j++,p--) {
				System.out.print(s.charAt(p)+" ");
			}
			System.out.println();
		}
	}
	public static void pattern4() {
		//R E D O C 
		//  E D O C 
		//   D O C 
		//    O C 
		//     C 
		String s ="CODER";
		int n=s.length();
		for(int i=1,p=4;i<=n;i++,p--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i,k=p;j<=n;j++,k--) {
				System.out.print(s.charAt(k)+" ");
			}
			System.out.println();
		}
	}
	public static void pattern5() {
	//	 R E D O C 
	//	  R E D O 
	//	   R E D 
	//	    R E 
	//	     R 

		String s ="CODER";
		int n=s.length();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i,k=4;j<=n;j++,k--) {
				System.out.print(s.charAt(k)+" ");
			}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
		//pattern1();
		//pattern2();
		pattern5();
		//pattern4();

	}

}
