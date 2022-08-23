Date : 22nd August 2022
Mentor: DEVANG SHARMA
Batch: January Batch - Mixed Batch (JAVA)

Agenda:
- Intro Session: DONE
- Intro To Java: DONE
- Compiled vs Interpreted Languages: DONE
- Loosely Types vs Strictly Types Languages: DONE
- JDK, JVM, JRE: DONE
- Variables and Constants: DONE

- Objects and Classes
- OOPS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





- Objects and Classes
- OOPS




Class 
Object


Class: 
Blueprint of Object
Collection of Objects


Object: 
Single Entity
Instance of a Class

"Object is an INSTANCE of a Class"

"Class is Blue Print and Object is Actual Things made from that blueprint"



Eg: 

Class: Pen
Object: Trimax, Pilot etc


Eg:

Class: Tesla
Object: Model 3, Model S, Model Y etc




Class 
= Combination of Data Members + Member Functions

Data Members: Data Type Members
Eg:   int batteryPercent;


Member Functions: Functions Defined in Class
Eg:   public int getBatteryPercent()




CODE:


class Tesla
{
  int batteryPercent;
  public Tesla(int batteryPercent)
  {
    this.batteryPercent = batteryPercent;
  }

  public int getBatteryPercent()
  {
    return batteryPercent;
  }

}

class Main
{
  public static void main(String[] args)
  {
    // Structure would remain same for all objects, values can be different for each object
    Tesla Model3 = new Tesla(90);
    Tesla ModelS = new Tesla(100);
 
    System.out.println("Model 3 battery percent: " + Model3.getBatteryPercent());
    System.out.println("Model S battery percent: " + ModelS.getBatteryPercent());
  }
}


OP:


Model 3 battery percent: 90
Model S battery percent: 100


Note:
(1) Structure would remain same for all objects, values can be different for each object
(2) Constructor:

- A Function Which is Used to Initialise Objects of a Class
- No return type
- Types: Default, Parameterised and Copy 




Class And Object Analogy:

Printer:

Image: Class
Printout: Object
100 Printouts : 100 Objects = Each With Same Structures, Values can be different









---> OOPs : Object Oriented Programming 

place
places = Plural of place

OOP: More than 1 Paradigm --> OOPs


4 different Paradigms (Standards) / Principles / Pillars of Object Oriented Programming:

- Encapsulation
- Abstraction
- Polymorphism
- Inheritance



(1) Encapsulation:

Capsule: Mixing of Different Ingredients


Data Members:

- Data to Work Upon 
- Variables or Constants or Data Structures

Eg: 

int a = 10;
String name = "Devang";
int[] arr = new int[100];




Member Function:

- Functions used to perform operations on Member data


Eg:

public void print()
{
  System.out.println(name);
}


Encapsulation:

{
  member_data
      +
  member_function    
}

= CLASS




Definition:
Binding (or Wrapping) Functions and data together into Single Unit (Class) is called Encapsulation




1st Gen - 5th Gen

Assembly Code:
Low Level Programing Language


Programming Languages:
FORTRAN, BASIC, COBOL, C, MATLAB



C++: C with Classes
OOPs

1995: Python
1998: Java




(2) Abstraction 

Eg: ATM Machine/ Cash Dispenser

Customer:
- Insert Card
- Enter Pin
- Withdraw Money


HIDDEN
BackEnd:


- Login to Server (using RFID Chip on Debit/Credit Card)
- Fetch your Details
- Update Transaction : curr_bal = curr_bal +/- amount


Each Transaction MUST be ACID Compliant


Metro Travel:
Scanner: RFID Card

HIDDEN

BackEnd:

- Check for Balance
- Update Balance after Each Trip in Metro




Definition:
Hiding Internal Details from User and Showing ONLY Functionality is called Abstraction

- Show What, Dont show how






Implementation:

Access Specifiers:
private, public and protected


private -> Not Accessible Outside Class



CODE:


class Tesla
{
  private int batteryPercent;
  public String modelName;
  public Tesla(int batteryPercent, String modelName)
  {
    this.batteryPercent = batteryPercent;
    this.modelName = modelName;
  }

  public int getBatteryPercent()
  {
    return batteryPercent;
  }

}

class Main
{
  public static void main(String[] args)
  {
    // Structure would remain same for all objects, values can be different for each object
    Tesla Model3 = new Tesla(90, "Model 3");

    System.out.println("Battery percent: " + Model3.batteryPercent);
    System.out.println("Model Name: " + Model3.modelName);
  }
}


OP:

Main.java:25: error: batteryPercent has private access in Tesla
    System.out.println("Battery percent: " + Model3.batteryPercent);
                                                   ^



Solution using Getter:

class Tesla
{
  private int batteryPercent; // Since Private, cannot use directly by object
  // But, Can be used by functions in same class

  public String modelName;
  public Tesla(int batteryPercent, String modelName)
  {
    this.batteryPercent = batteryPercent;
    this.modelName = modelName;
  }

  // public function, can be used by object of class
  public int getBatteryPercent()
  {
    return batteryPercent;
  }

}

class Main
{
  public static void main(String[] args)
  {
    // Structure would remain same for all objects, values can be different for each object
    Tesla Model3 = new Tesla(90, "Model 3");

    //System.out.println("Battery percent: " + Model3.batteryPercent);
    System.out.println("Battery percent: " + Model3.getBatteryPercent());
    System.out.println("Model Name: " + Model3.modelName);
  }
}


OP:

Battery percent: 90
Model Name: Model 3



(3) Polymorphism


Poly + Morph


Poly: Many
Morph: Forms


One task is performed in Different Ways

Two Ways to Achieve Polymorphism in Java:
(1) Compile Time Polymorphism - Method Overloading
(2) Run Time Polymorphism - Method Overriding



Operator Overloading:

+:

5 + 2 = 7 // Adding - Numbers
"dev" + "ang" = "devang" // Concatenation - Strings


Same Operator Behaves Differently With Different Types of Input --> Operator Overloading



Method Overloading:

Same Function Name With Different Signatures --> Gives Different Output


Signature: Return Type + Number/Type of Parameters

Compile Time Polymorphism is Achieved using Method Overloading


CODE:


class Main
{
  static int sumofNumbers(int a, int b)
  {
    return a + b;
  }

  // Method Overloading
  static int sumofNumbers(int a, int b, int c)
  {
    return a + b + c;
  }

  public static void main(String[] args)
  {
    int a = 10, b = 20, c = 30;

    System.out.println(sumofNumbers(a,b));
    System.out.println(sumofNumbers(a,b,c));
  }
}


OP:

30
60





(4) Inheritance:

iOS: 15.5
iOS: 15.6 = iOS 15.5 + New features


