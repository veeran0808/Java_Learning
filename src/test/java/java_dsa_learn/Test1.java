package java_dsa_learn;

public class Test1 {

	public static void main(String[] args) {
		//P: Find sum of numbers
		int arr[] = {5,4,2};
		int n = arr.length;
		int sum =0;
		for(int i=0; i<n;i++) {
			sum = sum+arr[i];
			System.out.println(sum);
		}
	}

}
