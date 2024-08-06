package New_11;

public class Employee {
    int eid;
    String name;
    int salary;
    Employee(int eid,String name,int salary){
        this.eid=eid;
        this.name=name;
        this.salary=salary;
    }

    public static void main(String[] args) {
        Employee e1 =new Employee(1212,"qwert",120000);
        System.out.println(e1.eid +" " + e1.name+" " + e1.salary);
        Employee e2=new Employee(1213,"qwwee",100000);
        System.out.println(e2.eid);
        System.out.println(e2.name);
        System.out.println(e2.salary);

    }
}
