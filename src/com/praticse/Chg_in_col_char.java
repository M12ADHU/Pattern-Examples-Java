package com.praticse;

public class Chg_in_col_char {
	public static void pattern(int n){
		for(int i=1,y='a';i<=n;i++,y++) {
			for(int j=1,p='A';j<=i;j++,p++) {
				System.out.print((char)p+" ");
				System.out.print((char)y+" ");
			}
			System.out.println();
		}}

	public static void main(String[] args) {
		pattern(5);
	}

}
