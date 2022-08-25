Date : 25th August 2022
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


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".











-----> Abstract Classes


abstract class name {......}

(1) A Class which is declared with abstract keyword is called Abstract Class in Java

(2) It can have BOTH abstract and non abstract methods


abstract method:
Method WITHOUT Body

non-abstract method:
Method With Body


int func(int a, int b); -- SIGNATURE - Function Declaration


Function Definition

int func(int a, int b)
{
  BODY
}



------> How to Achieve Abstraction in Java:

Hiding the Internal Implementation and Showing Only Functionality to User

Show What, Dont Show How


Ways to Achieve Abstraction in Java?

(1) Abstract Classes
- Does Not Provide 100 % Abstraction

(2) Interfaces
- Provides 100% Abstraction
- Interfaces can Provide Multiple Inheritance





-----> Properties of Abstract Classes


(1) A Class which is declared with abstract keyword is called Abstract Class 

(2) It can have BOTH abstract and non abstract methods 

(3) It CANNOT be Instantiated
Simple Terms: CANNOT Make/Create Objects of Abstract Class

(4) It MUST be Extended and Implement its abstract method by child class

(5) It can have constuctors and static methods also - IMP (Asked in Interview)

(6) It can have FINAL methods
- CANNOT Modify the method in child class
(No Method Overriding)


int a = 10;
a = 20;

final int p = 10;
p = 20; -> Error



class A
{
  member (Non- Static)
    + 
  function (Non- Static)
}

A obj = new A();
obj.member
obj.functions()


A obj: NOT ALLOWED

How to access member and function now?





3 Entry Points to Use Methods/Data Member of Class:

(A) Create Object of Class and Use - Normal Way

(B) If static data member or static function,
Directly Access by Class name

Note: Static functions CANNOT Use Non-Static Member or Methods

(C) If Class is Abstract, 
It MUST be Inherited to be used by object of child class





Code Eg - abstract class

abstract class name {
  .......
}

Code Eg - abstract Method

// NO Body for abstract method
abstract return_type name();


-----> Final Code:



// Bank -> SBI, HSBC - Hierarchical Inheritance

// Abstract Class
abstract class Bank
{
    // NO Body for abstract method
    abstract int getRateOfInterest();
}

class SBI extends Bank
{
    int getRateOfInterest()
    {
        return 6;
    }
}

class HSBC extends Bank
{
    int getRateOfInterest()
    {
        return 8;
    }
}

class Main
{
  public static void main(String[] args)
  {  
     // Bank b = new Bank(); - error: Bank is abstract; cannot be instantiated [in Main.java] 
      SBI s = new SBI();
      System.out.println("SBI: " + s.getRateOfInterest());

      HSBC h = new HSBC();
      System.out.println("HSBC: " + h.getRateOfInterest());
      
     
      // RHS to LHS Assignment
      // Constructor of SBI() Called --> Object of SBI Created
      // Object of SBI (Child Class) is given reference to Bank (Parent Class)
       Bank b = new SBI(); 
       System.out.println("SBI: " + b.getRateOfInterest());

      // Object of HSBC (Child Class) is given reference to Bank (Parent Class)
       b = new HSBC();
       System.out.println("HSBC: " + b.getRateOfInterest());
      
  }
}


OP:

SBI: 6
HSBC: 8
 
SBI: 6
HSBC: 8








Factory Method:

- An Abstract Method is NOT Implemented in Abstract Class - No Body
- Its Implementation is Given in Child Class


Abstract Class -> Template / Placeholder
Child Class -> Implementation of Template / Placeholder



Note:

Static Method: Common to Class, Not Specific to Ebery Object
Abstract Method: Specific to Every Child Class





CODE:

Abstract Class with constuctors and Non-Abstract Methods


// Bank -> SBI, HSBC - Hierarchical Inheritance

// Abstract Class
abstract class Bank
{
    // NO Body for abstract method
    abstract int getRateOfInterest();
    
    // Constructor of Abstract Class
    Bank()
    {
      System.out.println("Bank Constructor ");
    }
    
    // Non - Abstract Method
    void fiscalRate(int rate)
    {
      System.out.println("Fiscal Rate: " + rate);        
    }
}

class SBI extends Bank
{
    // Constructor of Child Class
    SBI()
    {
      System.out.println("SBI Constructor ");
    }
    
    int getRateOfInterest()
    {
        return 6;
    }
}

class HSBC extends Bank
{
    // Constructor of Child Class
    HSBC()
    {
      System.out.println("HSBC Constructor ");
    }

    int getRateOfInterest()
    {
        return 8;
    }
}

class Main
{
  public static void main(String[] args)
  {  
     // Bank b = new Bank(); - error: Bank is abstract; cannot be instantiated [in Main.java] 
      SBI s = new SBI();
      System.out.println("SBI: " + s.getRateOfInterest());
      s.fiscalRate(10);

      HSBC h = new HSBC();
      System.out.println("HSBC: " + h.getRateOfInterest());
      h.fiscalRate(10);

      
      System.out.println(" ");
      
        // RHS to LHS Assignment
      // Constructor of SBI() Called --> Object of SBI Created
      // Object of SBI (Child Class) is given reference to Bank (Parent Class)
       //Bank b = new SBI(); 
       //System.out.println("SBI: " + b.getRateOfInterest());

      // Object of HSBC (Child Class) is given reference to Bank (Parent Class)
      // b = new HSBC();
      // System.out.println("HSBC: " + b.getRateOfInterest());
      
  }
}



OP:


Bank Constructor 
SBI Constructor 
SBI: 6
Fiscal Rate: 10
Bank Constructor 
HSBC Constructor 
HSBC: 8
Fiscal Rate: 10





Note:


(1) Abstract Methods: Specific to Each Child Class

Eg: Rate of Interest os Specific to Each Bank


(2) Non - Abstract Methods: Common to Each Child Class

Eg: Fiscal Rate is Common for All Banks








---> Order of Invokation of Constructors and Destructors

