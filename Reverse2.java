import java.util.*;
class Reverse2{
 
  static int reverse(int n){
    int rev=0;
    while(n>0){
      rev=rev*10+n%10;
      n=n/10;
     }
    return rev;
  } 

  static int[] reverseArray(int A[]){
    return A;
}

 public static void main(String arg[]){
   Scanner s= new Scanner(System.in);
   System.out.println("Enter the no: ");
    int n = s.nextInt();
   System.out.println("Reverse of number: "+reverse(n));
   System.out.println("Enter array length: ");
    int length = s.nextInt();
    int A[] = new int [length];
    System.out.println("Enter array elements: ");
    for(int i=0;i<A.length;i++){
    A[i]=s.nextInt();}
    System.out.println("Reverse Array is :-> ");
    reverseArray(A);  
    s.close();
}}