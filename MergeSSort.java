import java.util.Arrays;

public class MergeSSort {
    void merge(int a[] , int b[] ){
        int x = a.length+b.length;
        int c[]=new int[x];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
       Arrays.sort(c);
       for(int i=0;i<x;i++){
        System.out.print(c[i]+" ");
       }
    }
    void merge1(int a[] , int b[] , int m , int n){
        int i=0 , j=0;
        while(i<m&&j<n){
            if(a[i]<=b[j]){
            System.out.print(a[i]+" ");
            i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
            while(i<m){
                System.out.print(a[i]+" ");
                i++;
            }
            while(j<n){
                System.out.print(b[j]+" ");
                j++;
            }
        }
    }
    public static void main(String[] args) {
        MergeSSort m = new MergeSSort();
        int a[]={1,2,3,4,5};
        int b[]={8,7,6,9};
        m.merge(a, b);
        System.out.println();
        m.merge1(a, b,5,4);
    }
}
