import java.util.*;

class Mycmp implements Comparator<Integer>{
    public int compare(Integer a , Integer b){
        return a%2 - b%2;
    }
}
public class SortEvenOdd {
    public static void main(String[] args) {
    Integer arr[]={5,20,10,3,12};
    Arrays.sort(arr,new Mycmp());
    System.out.println(Arrays.toString(arr));
    }
}
