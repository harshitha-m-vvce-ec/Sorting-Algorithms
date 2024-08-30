package Sorting;


class SelectionSort {
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// selection sort
		int arr[]= {4,7,8,2,5,1};
		
		for (int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int smallest=i;
				if(arr[smallest]>arr[j]) {
					//swap
					int temp=arr[smallest];
					arr[smallest]=arr[j];
					arr[j]=temp;
				}
			}
		}
		print(arr);

	}

}

