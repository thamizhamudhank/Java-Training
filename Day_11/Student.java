package New_11;

public class Student {
    int id;
    public String name;
    int age;
    Student(int id) {
        this.id = id;
    }
        Student(int id ,String name){
        this.id=id;
        this.name=name;
    }
    Student(int id,String name,int age){
        this.id=id;//this(id,name);
        this.name=name;
        this.age=age;
    }
}
class Students{
    public static void main(String[] args) {
        Student s1=new Student(1234);
        Student s2=new Student (1234,"qwert");
        Student s3 = new Student(1234,"qwer",18);
        System.out.println("Student id: "+s1.id);
        System.out.println("Student id: "+ s2.id +"Student name: "+ s2.name);
        System.out.println("Student id: "+s3.id +"Student name: "+s3.name +"Student age: "+ s3.age);
    }
}
