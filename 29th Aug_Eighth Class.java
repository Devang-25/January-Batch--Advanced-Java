Date : 29th August 2022
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
- Final Keyword: DONE
- Variable + Code: DONE
- Method + Code: DONE
- Class + Code: DONE
- Interview Questions on final keyword: DONE

- Access Specifiers

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".








----> FINAL Keyword in Java

Purpose:
Used to restrict the User


final keyword can be used in many contexts.
final can be:

(1) Variable
(2) Method
(3) Class

Java final keyword:
- Stop Value Change (final Variable -> Constant)
- Stop Overriding (final Method)
- Stop Inheritance (final class)


(1) Java final variable


If you make variable as final ---> Cannot Change Value
(It will be constant)



CODE:


public class Main 
{
    public static void main(String[] args) 
    {
        int a = 10;
        System.out.println(a);
        
        a = 20;
        System.out.println(a);
        
        final int b = 20;
        System.out.println(b);

        b = 40; // Error - final cannot be changed
        System.out.println(b);
    }
}



OP:

Line 14: error: cannot assign a value to final variable b [in Main.java]
        b = 40; // Error - final cannot be changed
        ^





(2) Java final Method

If you make any method as final ---> You CANNOT Override it

ALWAYS:
Parent class function is OVERRIDDEN by Child Class Function



CODE:


class Tesla
{
    final void run()
    {
        System.out.println("Tesla Running");
    }    
}

class Model extends Tesla
{
    void run()
    {
        System.out.println("Model Running");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.run();
    }
}

OP:

Model Running
Finished in N/A
Line 11: error: run() in Model cannot override run() in Tesla [in Main.java]
    void run()
         ^
  overridden method is final


(3) Java final class


If you make class as final ---> Cannot Inhierit it

CODE:

final class Tesla
{
    void run()
    {
        System.out.println("Tesla Running");
    }    
}

class Model extends Tesla
{
    void runModel()
    {
        System.out.println("Model Running");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.runModel();
        m.run();
    }
}



OP:



Line 9: error: cannot inherit from final Tesla [in Main.java]
class Model extends Tesla
                    ^










----> Interview Questions:


(1) Is final Method Inherited?
Ans: YES


Can a final method be Overridden?
Ans: NO



CODE:

class Tesla
{
    final void run()
    {
        System.out.println("Tesla Running");
    }    
}

class Model extends Tesla
{
    void run()
    {
        System.out.println("Model Running");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.run();
    }
}



After Inheritance:



class Model extends Tesla
{
    // From parent to Child -- Inherited
    final void run()
    {
        System.out.println("Tesla Running");
    }    

    void run()
    {
        System.out.println("Model Running");
    }
}


Model obj = new Model()
obj.run();

 

Since run() is available as BOTH final and non-final to Child Object (Model),
Compiler would be confused/ ambiguous which one to call?

Hence, final Method Are NOT Allowed to Override 




---> Prove that final method are Inherited but NOT Overriden


CODE:

class Tesla
{
   final void run()
    {
        System.out.println("Tesla Running");
    }    
}

class Model extends Tesla
{
    
}

public class Main 
{
    public static void main(String[] args) 
    {
        Model m = new Model();
        // There is NO run() in Child Class
        // Its Able to Use run() from Parent Class
        // - Final  Method is Inherited BUT NOT Overridden
        m.run();
    }
}


OP:

Tesla Running






(2) Constructor:
Initialise Objects of a Class


Is a Constructor Inherited?
- Yes


Can we Declare Constructor as final?
- No




(3) What is final Parameter/Argument?

int square(final int n)
{
  n = n + 1; // Error, Cannot change value 
  n++; // Error, Cannot change value 
  return n*n; // Allowed - Usage is Allowed
}


int square(int n)
{
  n = n + 1; // Allowed, Can change value 
  n++; // Allowed, Can change value 
  return n*n; // Allowed - Usage is Allowed  
}




(4)  What is Blank/Uninitialised final variable?



Blank Final Variable/Uninitialised Final Variable:
- Final variable that is NOT Initialised at the time of declaration


// Initialise final variable at declaration
final int a = 10;

// Not Initialise final variable at declaration - ALLOWED
final int b;


(5) How to Initialise Blank final variable?
- ONLY be Initialised in Constuctor




CODE:


class Tesla
{
    // Blank final variable
    final int speedLimit;
    
    Tesla()
    {
        speedLimit = 100;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla();
        System.out.println("Speed Limit: " + t.speedLimit);
    }
}





OP:

Speed Limit: 100
















































Polymorphism:

(1) Compile Time Polymorphism/ Static Binding:

- Method Overloading:
Same Function Name within the SAME CLASS with different signatures

Signature = Return Type + Number of Arguments

(2) Run Time Polymorphism/ Dynamic Binding/ Dynamic Method Dispatch:

- Method Overriding

Same Function name and signature within PARENT AND CHILD CLASS


CODE:

class Parent
{
  int func(int a)
  {
    return 6;
  }
}

class Child extends Parent
{
  int func(int a)
  {
    return 8;
  }
}

public class Main {
    public static void main(String[] args) 
    {
        Child obj = new Child();
        System.out.println(obj.func(10));
    }
}


OP:
8



Explanation:

After Inheritance, the func() would be inherited in child class


class Child extends Parent
{

  int func(int a) // Parent Class Function
  {
    return 6;
  }

  int func(int a) // Child Class Function
  {
    return 8;
  }

}


Same Function name, Same return type, Same Signature


Child obj = new Child();
obj.func(10)


ALWAYS (By Default) -> Child Class Function WILL BE Called from Child Class Object

OP: 8



Child Class Function Takes PRIORITY
--> Parent Class Function is OVERRIDDEN by Child Class Function

---> Method Overriding




---> Parent Object would always call parent function, 
Parents CANNOT Access Child functions, so No Confusion



---> How to Access Parent Function (Same name and signature as in Child Class) from Child Object?

super Keyword

CODE:

Child obj = new Child();
super(obj.func(10))

OP: 

6











Overwrite , Override

Overwrite: Updation

Override: Taking Priority
A will Override B -> A Decision will be final




