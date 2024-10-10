package veera_leet_Strings;

public class Leet_BesttimetoBuy {

	public static void main(String[] args) {
		
		int arr[] = {7,1,5,3,6,4};
		int n = arr.length;
		System.out.println("length of array"+n);
		int profit = 0;
		for(int i=0;i<n-1;i++) {
			System.out.println("length of i."+i);
			for(int j=i+1;j<n;j++) {
			//	System.out.println(arr[i]+"......"+arr[j]);
				int temp=arr[j]-arr[i];
				/*
				 * if(temp>profit) { profit = temp; }
				 */
				profit =Math.max(profit, temp);
			}
		}
		System.out.println(profit);

	}

}
