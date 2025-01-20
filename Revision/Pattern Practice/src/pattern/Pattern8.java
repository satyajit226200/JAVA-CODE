package pattern;

import java.util.Scanner;

class Pattern8 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j<=2*n && i>=j) {
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
