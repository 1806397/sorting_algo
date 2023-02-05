class insertionSort{
public static void main(String[] args) {
  int arr[]={34,54,6,90,17,8};
  System.out.println("Before sorting");
  printArray(arr);
  insertionSort is=new insertionSort();
  is.sort(arr);
  System.out.println("After sorting");
  printArray(arr);
}

private void sort(int[] arr) {
  for(int i=1;i<arr.length;i++){
    int j=i-1;
    int key=arr[i];
    while(j>=0 && arr[j]>key){
      arr[j+1]=arr[j];
      j=j-1;
    }
    arr[j+1]=key;
  }
}

private static void printArray(int[] arr) {
  for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
  }
}

}