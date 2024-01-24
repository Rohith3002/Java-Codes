package Innerclass;

public class Example6 {
    public static void main(String[] args) {
//        Parent parent = new Parent();
//        Child child = new Child();
//        parent= child;
//        //child = parent;

        Hello hello = new Child2();
        Hello hello2 = new Hello();
//        Child hai=hello;
        Child2 hai= (Child2)hello; // Down casting in class
        Child2 hai2= (Child2)hello2; // Down casting in class
    }
}
class Hello{}
class Child2 extends Hello{}

//Upcasting and Down casting in Class

class Parent{}
class Child extends Parent{}
