package New_22;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList123 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(40);
        a.add(10);
        a.add(30);
        for (Integer i : a) {
            System.out.println(a);
            ListIterator<Integer> li = a.listIterator();
            while (li.hasNext()){
                System.out.println(li.next());
                System.out.println("----------");
            }
            while(li.hasPrevious()){
                System.out.println(li.previous());
            }
        }
    }
}
