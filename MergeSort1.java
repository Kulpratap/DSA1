public class MergeSort1 {
    void merge(int arr[],int l ,int mid,int h){
         int n1=mid-l+1;
         int n2=h-mid;
         int left[]= new int[n1];
         int right[]= new int[n2];
         for(int i=0;i<n1;i++){
           left[i]=arr[l+i];
         }
         for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
          }
          int i=0,j=0,k=l;
          while(i<n1 && j<n2){
            if(left[i]<=right[j]){
             arr[k]=left[i];
              i++;
            }
            else{
              arr[k]=right[j];
              j++;
            }
            k++;
          }
          while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
          }
          while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
          }
         
    }
    void mergeSort(int arr[],int l,int h){
      if(l<h){
        int mid = (l+h)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, h);
        merge(arr,l,mid,h);
      }
    }
    void printarray(int arr[])
    {
      for(int x = 0;x<arr.length;x++){
        System.out.print(arr[x]+" ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
      MergeSort1 s = new MergeSort1();
      int arr[]={12,4,3,4,5};
      s.mergeSort(arr, 0, arr.length-1);
      s.printarray(arr);
      
    }
}
