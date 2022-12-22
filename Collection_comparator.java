import java.util.*;

class Point implements Comparable<Point> {
    int x,y;
    Point(int x , int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Point p){
        return this.x - p.x;
    }
}

public class Collection_comparator {
    public static void main(String[] args) {
    ArrayList<Point> list = new ArrayList<Point>();
    list.add(new Point(4,5));
    list.add(new Point(56,7));
    list.add(new Point(6,9));
    list.add(new Point(7,6));
    Collections.sort(list);
    for(Point P:list){
        System.out.println(P.x+" "+P.y);
    }
    }
}
