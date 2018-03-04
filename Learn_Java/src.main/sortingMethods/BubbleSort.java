package sortingMethods;

public class BubbleSort {


	public void bubbleSort(int arr[])
	{
		int length= arr.length;
		for(int i=0;i<length-1;i++)
		{
			System.out.println("");
			for(int j=0;j<length-i-1;j++) {
				
				if (arr[j] > arr[j+1])
                {
                    //swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
			}
		}
		
		
	}
	
	void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	public static void main(String args[])
	
	{
		int arr[]= {1,5,8,3,4,9};
		
		BubbleSort Bubblesort=new BubbleSort();
		
		Bubblesort.bubbleSort(arr);
		
		Bubblesort.printArray(arr);
			
		
	}
}
