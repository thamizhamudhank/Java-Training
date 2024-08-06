package New_22;

import java.util.ArrayList;

public class Array12 extends Student {
    public Array12(String name, int rollno, char gender) {
        super(name, rollno, gender);
    }

    public static void main(String[] args) {
        ArrayList<Student> a =new ArrayList<Student>();
        a.add(new Student("sanjai",103,'M'));
        a.add(new Student("Monish",102,'M'));
        a.add(new Student("Chris",101,'M'));
        for (int i = 0; i < a.size() ; i++) {
            Student s =a.get(i);
            System.out.println("Name of the Student is :"+s.name);
            System.out.println("Roll no of the Student :"+s.rollno);
            System.out.println("Gender of the Student :"+s.gender);
        }

    }
}
