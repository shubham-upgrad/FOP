public class QuickSortImplementation{
	public static int partition(int[] arr,int low,int high){
		int pivot = arr[high]; // Last element of the array as pivot
		int i = low - 1; // Starting with i= before the first element(bcz there are no
					// elements smaller than pivot...YET)
		int temp;
		for(int j=low;j<=high-1;j++){
			if(arr[j]<pivot){
				i++;

				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;

			}
		}
		temp=arr[i+1];
		arr[i+1]=pivot;
		arr[high] =temp;
		return i+1;


	}

	// @Parameters : arr - the array to be sorted
	//				low - INDEX OF first element in array/sub-array arr
	//				high - INDEX OF last element in array/sub-array arr
	public static void quickSort(int[] arr,int low,int high){
			if(low<high){
				// Partition the array
					//  - Get an index which can be used to partition the array
				int pi = partition(arr,low,high); 
				// Use pi to send partitioned sub-arraus to quicksort in recursive calls
				quickSort(arr,low,pi-1);
				quickSort(arr,pi+1,high);
			}
	}

	public static void main(String[] args) {
		
	int[] arr={4,3,1,2};
	quickSort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	}




}