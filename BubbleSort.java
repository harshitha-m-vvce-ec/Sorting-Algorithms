package Sorting;

public class BubbleSort {
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {4,6,3,7,2,8,1};
		// Bubble sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]<arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
			}
		}
		print(arr);

	}

}
