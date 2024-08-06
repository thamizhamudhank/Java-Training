package New_22;

import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("thamizh");
        arr.add('c');
        arr.add(20);
        arr.add("Rahul");
        arr.add(20.50f);
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i) instanceof Integer){
                System.out.println(i);
            }
            
        }
    }
}
