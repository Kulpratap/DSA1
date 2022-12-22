#include<iostream>
using namespace std;

void swap( int a , int b){
    int temp=a;
    a=b;
    b=temp;
}
int partition(int arr[] , int l , int h){
    int pivot = h;
    int i=l-1;
    for(int j=l;j<=h-1;j++){
        if(arr[j]<=pivot){
            i++;
        swap(arr[i],arr[j]);
        }
        swap(arr[i+1],arr[h]);
    }
    return (i+1);
}
void qsort(int arr[] , int l , int h){
    if(l<h){
        int p= partition(arr,l,h);
        qsort(arr,l,p-1);
        qsort(arr,p+1,h);
    }
}
void prints(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}

int main(){
    int arr[]={6,7,6,4,6,7};
    int n=6;
    qsort(arr,0,n);
    prints(arr,n);
    return 0;
}