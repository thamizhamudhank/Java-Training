package New_22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(20);
        a.add(40);
        a.add(10);
        a.add(30);
        LinkedList<Integer> a1=new LinkedList<Integer>(a);
       System.out.println(a1);
//
//        Collections.sort(a1);//Inbuild static method
//        System.out.println(a1);
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j <a.size() ; j++) {
                if(a.get(i)<a.get(j)){
                    Integer temp =a.get(i);
                    a.set(i, a.get(j));
                    a.set(j,temp);
                }

            }
        }
        System.out.println(a);

    }
}
