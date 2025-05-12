import java.sql.SQLOutput;
import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {
        //main code implementation
        Horse h = new Horse();
        System.out.println(h.colour);
        Student s1 = new Student();
        s1.schoolName = "yms";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "abcd";
        Queen q = new Queen();
        q.moves();

        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.walk();
        c.eat();

        System.out.println(h.colour);
        System.out.println(c.colour);


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.5));
        System.out.println(calc.sum(1,2,3));
          Deer D = new Deer();
          D.eat();

        Pen p1 = new Pen();
        p1.setColour("blue");
        System.out.println(p1.getColour());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColour("yellow");
        System.out.println(p1.getColour()   );

        Bankaccount myacc = new Bankaccount();
        myacc.username = "dhruvjain";
        myacc.setPassword("abcdef");
    }
}


//SUPER KEYWORD
class Animal{
    String colour;
    Animal(){
        System.out.println("animal cons is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.colour = "brown";
        System.out.println("horse cons is called");
    }
}


//STATIC KEYWORD
class Student{
    static int returnprecentage(int math,int phy ,int chem) {
        return (math + phy + chem);
    }

    String name;
    int roll;

    static String schoolName;
    void  setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}


//INTERFACES
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class king implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}


//ABSTRACTION
abstract class Animal{
    String colour;

    Animal(){
        colour = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changecolour(){
        colour = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    void changecolour(){
        colour = "dark grey";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}


//POLYMORPHISM
    //method overriding
class Animal{
    void eat(){
        System.out.println("eats");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
    //method overloading
class Calculator{
    int sum (int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}


//INHERITANCE
//Base class
class Animal{
    String colour;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}
//Derived class
class Mammal extends Animal{
    int legs;
}
class Dog extends Animal{
    String breed;
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
}


//OOPS
    //classes and objects

 class Bankaccount {
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
//get and set method
 class Pen {
    private String colour;
    private int tip;

    String getColour(){
        return this.colour;
    }
    int getTip(){
        return this.tip;
    }

    void setColour(String newColour){
        this.colour = newColour;
    }
    void setTip(int newTip){
        this.tip = newTip;

         //CONSTRUCTORS
        Student s1 = new Student();
        s1.name = "dhruv";
        s1.roll = 21;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[1] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);

        }

    }
 }
 class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is ");
    }

    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
 }
