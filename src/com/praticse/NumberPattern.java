package com.praticse;

public class NumberPattern {
	public static void pattern(int n){
		int p=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}}


	public static void main(String[] args) {
		pattern(5);
	}

}
