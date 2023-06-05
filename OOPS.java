//OOPS
class Pen{
    String color;
    String type;//ball or gel

    public void write() {
        System.out.println("Write Something");

    }

    public void printcolor() {
        System.out.println(this.color);
    }
}


//Polymorphism
class Student{
    String name;
    int age;

    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age,String name){
        System.out.println(name+" "+age);
    }


//Inheritance
    class shape{
        String color;
    }
    class Triangle extends shape{

    }


public class OOPS {
    public void main(String args[]){

//        Object Creation
//        Pen pen1=new Pen();
//        pen1.color="blue";
//        pen1.type="gel";
//
//        Pen pen2=new Pen();
//        pen2.color="black";
//        pen2.type="ball";
//
//       pen1.printcolor();
//
//       Student s1=new Student();
//       s1.name="aman";
//       s1.age=24;
//
//       Student s2=new Student();
//       s2.name="Sumit";
//       s2.age=34;


//Polymorphism
//s1.printInfo(s1.age);
//s1.printInfo(s1.name);
//s1.printInfo(s1.age,s1.name);

        Triangle t1=new Triangle();
        t1.color="red";
    }
}
