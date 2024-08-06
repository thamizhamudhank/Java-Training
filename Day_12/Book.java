package New_12;

import java.util.jar.JarOutputStream;

public class Book {
   static int price;
    int pages;
    Book(int pages){
      //  this pages=pages;

    }

    public static void main(String[] args) {
        Book b1=new Book(100);
        Book b2=new Book(200);
        Book b3=new Book(300);

        b1.price = 100;
        System.out.println(b1.price);
        System.out.println(b2.price);
        System.out.println(b3.price);

        b2.price = 200;
        System.out.println(b2.price);
        System.out.println(b1.price);
        System.out.println(b3.price);

    }
}
