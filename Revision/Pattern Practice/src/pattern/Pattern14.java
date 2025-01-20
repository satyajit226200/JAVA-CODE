package pattern;

import java.util.Scanner;

class Pattern14 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
                if(i>=j && i>=j && i+j<=2*n) {
                	System.out.print("*"+" ");
                }
                else if(i<=j && i+j>=2*n && i-j<=0 ) {
                	System.out.print("*"+" ");
                }
                else {
                	System.out.print(" "+" ");
                }
			}
			System.out.println();
		}
	}
}

//Doubt
