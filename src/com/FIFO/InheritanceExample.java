package com.FIFO;
class Parent  { // Base class
    Parent() {
        System.out.println("This is a Parent default constructor");
    }
    
    Parent(String name) {
        System.out.println("This is a Parent  constructor"
        		+name);
    }

 

    void display() {
        System.out.println("This is a Parent behaviou");
    }
}

 

class Child extends Parent { // derived class

	Child() {
        System.out.println("This is a Child default constructor");
    }

    Child(String name) {
        super();
        System.out.println("This is a child  constructor"+name);

 

    }

 

    void display() {
         super.display();

 

        System.out.println("This is a child behaviour");
    }
}

 

public class InheritanceExample {
    public static void main(String[] args) {

 

         new Child("Paramenter constructor");
  Parent p=new Child();
  p.display();
  ConEncIn con=new ConEncIn();
  con.setEmail("Nitinc@maveric-systems.com");
  System.out.println(con.getEmail());
        
    }

 

}