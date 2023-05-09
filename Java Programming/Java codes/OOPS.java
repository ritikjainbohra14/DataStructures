

public class OOPS{
    public static void main(String[] args) {
    //    Pen p1 = new Pen(); // it will create space in memory
    //    p1.setcolor("Blue");
    //    System.out.println(p1.getcolor());
    //    p1.settip(5);
    //    System.out.println(p1.gettip());
       
    //    //p1.setcolor("Yellow");
    //    p1.setcolor("yellow");
    //    System.out.println(p1.getcolor());

    //    Bankaccount myacc = new Bankaccount();
    //    myacc.username = "ritikbohra";
    //    myacc.setpassword("122345");

    //    Student s1 = new Student();
    //    s1.name = "Ritik";
    //    s1.Rollno = 25;
    //    s1.password = "xyz";
    //    s1.marks[0] = 100;
    //    s1.marks[1] = 80;
    //    s1.marks[2] = 70;

    //    Student s2 = new Student(s1);
    //    s2.password = "2345";

    //    s1.marks[2] = 90;

    //    for (int i = 0; i < 3 ; i++) {
    //       System.out.println(s2.marks[i]);
    //    }

    //    Fish Shark = new Fish();
    //    Shark.eat();

    //    dog dobby = new dog();
    //    dobby.eat();;
    //    dobby.legs = 4;
    //    System.out.println(dobby.legs);

    // Calculator calc = new Calculator();
    // System.out.println(calc.sum(2, 3));
    // System.out.println(calc.sum(5, 6, 7));
    // System.out.println(calc.sum((float)1.4, (float)6.5));

    // Deer d = new Deer();
    // d.eat();

    // Horse h = new Horse();
    // h.eat();
    // h.walk();

    // Chiken c = new Chiken();
    // c.eat();
    // c.walk();

    //Mustang myhorse = new Mustang();

    // Queen q = new Queen();
    // q.moves();

    Student s1 = new Student();
    s1.schoolName = "JNU";

    Student s2 = new Student();
    System.out.println(s2.schoolName);




    }

}

//*********************Static keyword************8********* */
class Student {
    String name;
    int roll;

    static String schoolName;

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;
    }
}
//*********************Static keyword************8********* */

//********************Interface****************************
interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal in all direction");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal just 1 step");
    }
}
//********************Interface****************************

// *******************Abstraction**************************
abstract class Animal {
    Animal(){
        System.out.println("Aniaml constructor is called");
    }
    void eat() {
        System.out.println("aniaml eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void walk() {
        System.out.println("walk with 4 legs ");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

class Chiken extends Animal{
    void walk(){
       System.out.println("walk on 2 legs"); 
    }
}
// *******************Abstraction****************************************************************************************8



// *****************Method Overiding *************************************************************************************
// class Animal {
//     void eat(){
//         System.out.println("eat anything");
//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("Eats grass");
//     }
// }
// *****************Method Overiding **********************


// Method Overloading *************************************
class Calculator {
    int sum(int a , int b ){
        return a + b;
    }

    float sum(float a , float b){
        return a + b;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }
}
// Method Overloading *************************************



class Pen{
    private String color;
    private int tip;

    String getcolor(){
        return color;
    }

    int gettip(){
        return tip;
    }

    void setcolor(String newcolor) {
       color = newcolor;
    }

    void settip(int newtip){
       tip = newtip;
    }
}

// class Animal {
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }
    
//     void breadth(){
//         System.out.println("breadth");
//     }
// }

//Derived class

// class Fish extends Animal {
//     int fins;

//     void swim(){
//       System.out.println("swin in water");  
//     }
// }

// class Mammel extends Animal{
//     void walks(){
//         System.out.println("walks");
//     }
// }

// class Bird extends Animal{
//     void fly(){
//         System.out.println("flys");
//     }
// }

// class dog extends Mammel{
//     String bread;
// }

//**********************Contructor**********************
// class Student{
//     String name;
//     int Rollno;
//     float percentage;
//     String password;
//     int marks[];
  //  shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = name;
    //     this.Rollno = Rollno;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor

    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.Rollno = s1.Rollno;

    //     for (int i = 0; i < marks.length; i++) {
    //         this.marks[i] = s1.marks[i];
    //     } 
    // }

    // Student(){
    //     marks = new int[3];
    //     System.out.println("Constructor is called");
    // }

    // Student(String name){
    //     marks = new int[3];
    //     this.name = name;
    // }

    // Student(int Rollno){
    //     marks = new int[3];
    //     this.Rollno = Rollno;
    // }
   


class Bankaccount{
    public String username;
    private String password;

    void setpassword(String pwd){
        password = pwd;
    }
}
//**********************Contructor**********************