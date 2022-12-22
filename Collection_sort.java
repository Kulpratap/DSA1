import java.util.*;
public class Collection_sort {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(20);
    list.add(5);
    list.add(89);
    list.add(78);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);
    }
}
