package com.onebill.corejava.basics.Assignment24;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		int inp;
		int temp1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value:");
		inp = sc.nextInt();
		temp1 = inp;
		for(int i=1; i<=inp; i++) {
			for(int j=0; j<temp1; j++) {
				System.out.print(" ");
			}
			temp1--;
			for(int k=0; k<i; k++) {
				if((k==0) || (k== (i-1))) {
					System.out.print(1+" ");
				}
				else {
					System.out.print((i-1)+" ");
				}
			}
			System.out.println("");
		}
		sc.close();
		

	}

}
