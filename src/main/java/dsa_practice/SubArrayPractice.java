package dsa_practice;

import java.util.Arrays;

public class SubArrayPractice {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int r =1;
		
		System.out.println("Before rotation of the array" + Arrays.toString(a));
		a=rotateLeft(a,r);
		System.out.println("After rotation of the array" + Arrays.toString(a));
	}

	private static int[] rotateLeft(int[] a, int r) {
		int temp,prev,i,j;
		for(i=0;i<r;i++) {
			prev=a[0];
			for(j=a.length-1;j>=0;j--) {
				temp=a[j];
				a[j]= prev;
				prev=temp;
			}
		}
		return null;
	}

}
