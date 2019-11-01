public class MergeSortImplementation{
	public static void merge(int[] arr,int low, int middle, int high){
		// Get sizes of the sub arrays
		// Sub arrays are : low...middle and middle+1....high in arr
		int n1=middle-low+1;
		int n2=high-middle;
		int[] L=new int[n1]; // Temp array for left sub array
		int[] R=new int[n2]; // Temp array for right sub array
		// Copying values in temp arrays
		for(int i=0;i<n1;i++){
			L[i]=arr[low+i];
		}
		for(int j=0;j<n2;j++){
			R[j]=arr[middle+1+j];
		}
		int i=0,j=0;
		int k=low; // We are merging sorted L and R into a sorted 3rd array C
		// and we will be taking 'arr' as C(the values of arr will be replaced by
		// merged array values)
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				arr[k]=L[i];
				i++;
			}else{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		// Append remaining values
		while(i<n1){
			arr[k++]=L[i++];
		}
		while(j<n2){
			arr[k++]=R[j++];
		}

	}
	public static void mergeSort(int[] arr,int low, int high){
		
		if(low<high){
			int middle=(low+high)/2;
			mergeSort(arr,low,middle);
			mergeSort(arr,middle+1,high);
			merge(arr,low,middle,high);
		}
	}
	public static void main(String[] args) {
		
	int[] arr={4,3,1,2,5,8,11,6};
	mergeSort(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	}




}