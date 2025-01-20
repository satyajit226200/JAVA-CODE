package com;

class NegativeNumberRight {

	public static void main(String[] args) {

		int[] a= {-10,20,-2,30,40};
		int neg=a[0];
		for(int i=0;i<a.length;i++) {
			 if(neg>0) {
				 a[i]=a[i+1];
				 neg=a[i]
			 }
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
