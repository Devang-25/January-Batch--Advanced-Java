Date : 23rd August 2022
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


- static keyword

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





(4) Inheritance:



Child Class Inherits the Features of Parent Class



class A
{
  ----
}

class B extends A
{
  All Features (Able to be Inherited) of A
      +
  New Features    
}


B: Child Class/ Subclass / Derived Class
A: Parent Class/ Superclass / Base Class



Real Life Example:

iOS: 15.5
iOS: 15.6 = iOS 15.5 Features + New Features




Why Inheritance?

(1) Code Reusability:
Child Class has Parent Class Features + New Features

(2) Ease of Maintainance

(3) Runtime Polymorphism - Method Overriding
When Parent Class And Child Class has SAME Function Names with Same Signature



Types of Inheritance:

(1) Single Inheritance (A --> B)

A: Parent
B: Child

Eg: Single Parent passes properties to Single Child


(2) Multiple Inheritance (A, B -> C) (N:1)
- NOT Supported in Java
(Cannot Be Achieved by Classes, Can Be Achieved By Interfaces)

A,B: Parents
C: Child

Eg: One Child can Have Properties of Both Mother and Father


(3) Multilevel Inheritance (A -> B -> C)

A: Parent
B: Parent + Children of A
C: Child of B

Eg: Grandfather -> Father -> Son


(4) Hierarchical Inheritance (A -> B,C) (1: N)
- Opposite of Multiple Inheritance


A: Parent
B,C: Children

Eg: Siblings can have Properties of Father


(5) Hybrid Inheritance (A -> B,C -> D)
Combination of Any Two or More Inheritance Types








CODE:

(1) Single Inheritance:
A --> B

// Parent Class
class Tesla
{
  public String modelName;
  public void printTesla(String modelName)
  {
    System.out.println(modelName);
  }
}

// Child Class -> Single Inheritance
class Model extends Tesla
{
  void printModel(String modelName)
  {
    System.out.println(modelName);
  }
}

class Main
{
  public static void main(String[] args)
  {
    // Object of Child Class
    Model m = new Model();

    // Accessing the Child Class Function
    // Child Class Object Accessing the Child Class Function
    m.printModel("Model S");

    // Child Class Object Accessing the Parent Class Function
    m.printTesla("Tesla 3");
  }
}


OP:

Model S
Tesla 3



(2) Multiple Inheritance:
- NOT Supported in Java
(Cannot Be Achieved by Classes, Can Be Achieved By Interfaces)


(3) Multilevel Inheritance
A -> B -> C


// Car -> Tesla -> Model

// Parent Class
class Car
{
  void printCar(String carName)
  {
    System.out.println("Car: " + carName);
  }
}

// Parent Class + Child Class
class Tesla extends Car
{
  public void printTesla(String teslaName)
  {
    System.out.println("Tesla: " + teslaName);
  }
}

// Child Class 
class Model extends Tesla
{
  void printModel(String modelName)
  {
    System.out.println("Model: " + modelName);
  }
}

class Main
{
  public static void main(String[] args)
  {
    // Object of Child Class
    Model m = new Model();

    // Accessing the Child Class Function
    // Child Class Object Accessing the Child Class Function
    m.printModel("Model S");

    // Child Class Object Accessing the Parent Class Function
    m.printTesla("Tesla 3");

    // Child Class Object Accessing the Function of Parent Class of Parent Class 
    m.printCar("Car 3");
  }
}


OP:

Model: Model S
Tesla: Tesla 3
Car: Car 3




(4) Hierarchical Inheritance

A -> B,C 
(1: N)

// Tesla -> Model, Battery

// Parent Class 
class Tesla 
{
  public void printTesla(String teslaName)
  {
    System.out.println("Tesla: " + teslaName);
  }
}

// Child Class - 1
class Model extends Tesla
{
  void printModel(String modelName)
  {
    System.out.println("Model: " + modelName);
  }
}

// Child Class - 2
class Battery extends Tesla
{
  void printBattery(String batteryName)
  {
    System.out.println("Battery: " + batteryName);
  }
}



class Main
{
  public static void main(String[] args)
  {
    // Object of Child Class
    Model m = new Model();
    // Accessing the Child Class Function
    // Child Class Object Accessing the Child Class Function
    m.printModel("Model S");
    // Child Class Object Accessing the Parent Class Function
    m.printTesla("Tesla 3");

    System.out.println(" ");

    // Object of Child Class
    Battery b = new Battery();
    // Accessing the Child Class Function
    // Child Class Object Accessing the Child Class Function
    b.printBattery("5x Series");
    // Child Class Object Accessing the Parent Class Function
    b.printTesla("Tesla Battery 3");

    // Accessing the Sibling Class - NOT ALLOWED
    // b.printModel("Model S"); 
  }
}


OP:

Model: Model S
Tesla: Tesla 3
 
Battery: 5x Series
Tesla: Tesla Battery 3




(5) Hybrid Inheritance:
- Combination of Any Two or More Inheritance Types















----> static keyword in JAVA

Purpose:
Memory Management


Where we can Use static:
- Variable
- Method
- Block
- Nested Classes


(1) Java Static Variable:

static type name: Static Variable

Eg: 

static String str;
static int a;

- Static Variable is used to refer COMMON PROPERTY of all Objects
Eg: 
ClassName - static 
roll_no: Not static 

- Static Variable gets memory ONLY ONCE in Class Area



class A
{
  int data;
  A(int data)
  {
    this.data = data;
  }
}


A obj1 = new A(10);
A obj2 = new A(20);


Note:

int data will be Created for EVERY Object you create for class

Total Size: O(4* Number of Objects)



CODE:


class Employee
{ 
  int emp_id;
  String name;

  static String companyName = "Google";

  Employee(int emp_id, String name)
  {
    this.emp_id = emp_id;
    this.name = name;
  }

  void display()
  {
    System.out.println("Employee ID: " + emp_id +  " Name: " + name);
  }
}


class Main
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee(1, "John");
    Employee e2 = new Employee(2, "Undertaker");

    e1.display(); // Non Static Method -- Use By Object Name
    e2.display();

    // Static Variable - Use by Class Name
    System.out.println("Company Name: " + Employee.companyName);
  }
}


OP:

Employee ID: 1 Name: John
Employee ID: 2 Name: Undertaker
Company Name: Google




