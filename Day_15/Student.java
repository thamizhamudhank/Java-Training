package New_15;

public class Student extends Person{
    int id;
    Student(String name,int id) {
        super(name);
        this.id=id;
    }
    public static void main(String[] args) {
        Student s1=new Student("Ramu",5);
        System.out.println(s1.name);
        System.out.println(s1.id);
    }
}
