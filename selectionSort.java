public class selectionSort {
  public static void main(String[] args) {
    int arr[]={43,56,4,17,9,12,3,99};
    System.out.println("Before Sorting");
    printArray(arr);
    selectionSort ss=new selectionSort();
    ss.sort(arr);
    System.out.println("After Sorting");
    printArray(arr);
  }

  private void sort(int[] arr) {
    for(int i=0;i<arr.length-1;i++){
      int min_index=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[min_index] > arr[j]){
          min_index=j;
        }
      }
    int temp=arr[i];
    arr[i]=arr[min_index];
    arr[min_index]=temp;
    }
  }

  private static void printArray(int[] arr) {
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
  }
}
