Date : 26th August 2022
Mentor: DEVANG SHARMA
Batch: January Batch - Mixed Batch (JAVA)

Agenda:
- Intro Session: DONE
- Intro To Java: DONE
- Compiled vs Interpreted Languages: DONE
- Loosely Types vs Strictly Types Languages: DONE
- JDK, JVM, JRE: DONE
- Variables and Constants: DONE
- Objects and Classes: DONE
- OOPS
- Encapsulation and Code: DONE
- Abstraction and Code: DONE
- Polymorphism and Code: DONE
- Inheritance and Code: DONE
- static keyword: DONE
- Variable + Code: DONE
- Method + Code: DONE
- Block + Code: DONE
- Nested Classes: DONE
- this Keyword: DONE
- Abstract Classes: DONE
- Abstract Methods: DONE
- Order of Invokation of Constructors and Destructors: DONE
- Interfaces: DONE
- Assignments Ques: DONE


- Final Keyword


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".










---> Order of Invokation of Constructors and Destructors


Constructor Invocation: When Object is created

Destructor Invocation: When Object is Deleted or Program is Ended

Java: System GC: Garbage Collection


A (Parent)  ---> B (Child) ---> C (Child of B) -> D (Child of C)

Multilevel Inheritance

C obj = new C();


Order of Invocation of Constructors: A -> B -> C
(Parent to Child) (TOP DOWN)

Note:

D Constructor would NOT Be Called

Child Class Object can access parent class Constructor
Parent Class Object CANNOT Access Child Class Constructor



Invocation of Destructors:
= Opposite of Invocation of Constructors


A (Parent)  ---> B (Child) ---> C (Child of B) -> D (Child of C)

Multilevel Inheritance

C obj = new C();


Order of Invocation of Destructors: C -> B -> A
(Child to Parent) (BOTTOM UP)










-----> Interfaces

- Interface is BLUEPRINT of Class
- It has static, final and abstract methods
- Interfaces can have BOTH abstract and non-abstract methods

Abstract Method: No Method Body


Purpose of Using Interfaces?
(1) Achieve 100% Abstraction
(2) Acheive Multiple Inheritance
(3) Achieve Loose Coupling

Monolith Architecture:
- Stand Alone Application
- One Source Code for All Features in the Product

Microservice Architecture:
- Distributed Services for Product
- Each Service is independent of each other in the Product


Total Abstraction (100%)
- All Methods are Abstract
- Fields are public, static or final by default
- A Class that implements an Interface MUST Implement All the methods declared in interface




Syntax:

interface <name>
{
  // Constants Fields (Final Keywords)
  // All Methods are Abstract Methods by default
}

- Data: final
- Function: Abstract (By Default)


Actual Code:

interface devang
{
  int val = 5;
  void show();
}


Processed Code By Compiler:

interface devang
{
  public static final int val = 5; // Data Member: Constant
  public abstract void show(); // Member Function: abstract
}


Data: public static final ___

Function: public abstract ___





----> Relationship between Classes and Interfaces


(1) Class - Class Relationship
class extends class

(2) Class - Interface Relationship
class implements interface


Note: interface CANNOT implements class

(3) Interface - Interface Relationship
interface extends interface



CODE:


interface Bank
{
    void print(); 
    // Compiles as : public abstract void print()
}

class SBI implements Bank
{
    public void print()
    {
        System.out.println("SBI");
    }
}

public class Main {
    public static void main(String[] args) 
    {
        SBI s = new SBI();
        s.print();
    }
}


OP:

SBI









Assignment:



Player Game


interface ISaveable {
    List<String> write();
    void read(List<String> list);
}

class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private int strength;
    public Player(String name,int hitPoints,int strength){
        this.name=name;
        this.strength=strength;
        this.hitPoints=hitPoints;
        this.weapon="Sword";
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);
        return values;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }
    @Override
    public String toString(){
        return "Player{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+", weapon='"+this.weapon+"'}";
    }
}

class Monster implements  ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public Monster(String name, int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }
    @Override
    public String toString(){
        return "Monster{name='"+this.name+"', hitPoints="+this.hitPoints+", strength="+this.strength+"}";
    }

}










Sort Array



/*
interface ISort{
    public int[] sort(int[] arr);
}
*/

// implement classes here


class BubbleSort implements ISort{
    public int[] sort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
}
class InsertionSort implements ISort{
    public int[] sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return  arr;
    }
}
class MergeSort implements ISort{
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
    public int[] sort(int[] arr){
        int n=arr.length;
        sort(arr,0,n-1);
        return arr;
    }
}
class SelectionSort implements ISort{
    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}









Shapes - Class Inheritance


//Do not change the name of the class

import java.util.*;

// Do not edit the Quadrilateral class


abstract class Quadrilateral {
   double side1;
   double side2;
   double side3;
   double side4;

   public Quadrilateral(double side1, double side2, double side3, double side4) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
       this.side4 = side4;
   }

   protected abstract double getArea();

   protected double getPerimeter() {
       return (side1+side2+side3+side4);
   }
}

class Parallelogram extends Quadrilateral {
   double heightPerpendicularToSide1;

   public Parallelogram(double side1, double side2, double height) {
       super(side1, side2, side1, side2);
       this.heightPerpendicularToSide1 = height;
   }
   
   public double getArea() {
       return side1*heightPerpendicularToSide1;
   }
}

class Rhombus extends Parallelogram {
   public Rhombus(double side, double height) {
       super(side, side, height);
   }
}

class Rectangle extends Parallelogram {
   public Rectangle(double length, double breadth) {
       super(length, breadth, breadth);
   }
}

class Square extends Rhombus {
   public Square(double side) {
       super(side, side);
   }
}

// Do not edit the Main class
class Main {
   public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);

       //Parallelogram
       double side1 = scan.nextDouble();
       double side2 = scan.nextDouble();
       double height = scan.nextDouble();
       Parallelogram parallelogram = new Parallelogram(side1, side2, height);
       
       //Rhombus
       double side = scan.nextDouble();
       double heightOfRhombus = scan.nextDouble();
       Rhombus rhombus = new Rhombus(side, heightOfRhombus);
       
       //Rectangle
       double length = scan.nextDouble();
       double breadth = scan.nextDouble();
       Rectangle rectangle = new Rectangle(length, breadth);
       
       //Square
       double sideOfSquare = scan.nextDouble();
       Square square = new Square(sideOfSquare);

       if(side1<0 || side2<0 || heightOfRhombus<0 || height<0 || side<0 || length<0 || breadth<0 || sideOfSquare<0){
           System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
           return;
       }

       
       System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter() +" and Area of Parallelogram is " + parallelogram.getArea());
       System.out.println("Perimeter of Rhombus is " + rhombus.getPerimeter() +" and Area of Rhombus is " + rhombus.getArea());
       System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter() +" and Area of Rectangle is " + rectangle.getArea());
       System.out.println("Perimeter of Square is " + square.getPerimeter()+ " and Area of Square is " + square.getArea());

       scan.close();
   }
}







Calculator


class Calculator implements  CalculatorInterface{
    public  int num1;
    public int num2;
    Calculator(){
        num1=num2=0;
    }
    Calculator(int a,int b){
        num1=a;
        num2=b;
    }
    public int add(){
        return num1+num2;
    }
    public int add(int a,int b){
        return a+b;
    }
    public int sub(){
        return num1-num2;
    }
    public int sub(int a,int b){
        return a-b;
    }

}






