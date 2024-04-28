package com.praticse;

public class Diamond {
	public static void diamond(){
		int n=5,p='A';
		
		  for(int i=1;i<n;i++,p++) { for(int j=i;j<=n;j++) { System.out.print("  "); }
		  for(int j=1;j<i;j++) { System.out.print((char)p+" "); } for(int j=1;j<=i;j++)
		  { System.out.print((char)p+" "); } System.out.println(); }
		 
		
		for (int i = 1; i <= n; i++, p--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print((char) p + " ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print((char) p + " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		diamond();

	}

}
