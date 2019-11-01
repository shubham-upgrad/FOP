public class InsertionSortImplementation{
	static void insertionSort(int[] arr){
		// The code
		int temp,j;
		if(arr.length>1){
			for(int i=1;i<arr.length;i++){
				// arr[i]  The element which needs to be placed in its right place
				// in the sorted sub list
				temp=arr[i];
				j=i-1;
				while(j>=0 && arr[j]>temp){
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=temp;
			}
		

		}


	}

	public static void main(String[] args) {
		
	int[] arr={4,3,1,2};
	insertionSort(arr);
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	}




}