package pattern;

import java.util.Scanner;

class Pattern18 {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=1;		
			for(int j=1;j<=n;j++) {
				if(i>=j) {
				System.out.print(a+" ");
				a++;
				}
				else {
					System.out.print(" "+" ");
				}

			}
			System.out.println();
				
			}
	}
				

}
