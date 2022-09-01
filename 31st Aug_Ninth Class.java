Date : 31st August 2022
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
- OOPs
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
- Access Specifiers: DONE
---> End of Core Java

- JDBC
- Spring
- Spring Boot


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





---> Access Modifiers


Modifiers:
Anything which modifies


Modification:
- Access
- Value


Types of Modifiers:

(1) Access Modifiers

- Specifies the Access or Scope of a :
(A) data/field
(B) method
(C) Constructor
(D) class

Eg: private, public, protected, default

(2) Non-Access Modifiers

- Changes/Specifies the Behaviour of a:

(A) data/field
(B) method
(C) Constructor
(D) class


Eg: final, static, abstract, volatile, synchronized, native, volatile, transient etc






Types of Access Modifiers (4):

(1) Private

Access Level: Within the Class

Within Class: YES
Within Package: NO
Outside Package by Child Class: NO
Outside Package by Object of Same Class: NO



(2) Default

Access Level: Within the Package


Within Class: YES
Within Package: YES
Outside Package by Child Class: NO
Outside Package by Object of Same Class: NO




(3) Protected

Access Level: Within the Package and Outside the Package ONLY By using Child Class



Within Class: YES
Within Package: YES
Outside Package by Child Class: YES
Outside Package by Object of Same Class: NO


(4) Public

Access Level: Everywhere


Within Class: YES
Within Package: YES
Outside Package by Child Class: YES
Outside Package by Object of Same Class: YES












Package: Collection of Classes and Interfaces






pgk - A.java + B.java


A.java

public class A
{

}

class A_1
{

}




B.java

import pkg/A

public class B
{
  A obj = new A();
}

class B_1
{
  A_1 obj1 = new A_1();
}





CODE:

(1) Private:

Access Level for Both Data and Functions: Within the Class


class Tesla
{
    String name = "Model S"; // Default Access 
    private int speedLimit = 100;
    private void print()
    {
        System.out.println("SpeedLimit: " + speedLimit);
        
    }
}
    
public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla();
        System.out.println(t.name); // Default Access 
        System.out.println(t.speedLimit); // Private Access 
        t.print(); // Private Access 
    }
}


OP:

Line 18: error: speedLimit has private access in Tesla [in Main.java]
        System.out.println(t.speedLimit); // Private Access
                            ^
Line 19: error: print() has private access in Tesla [in Main.java]
        t.print(); // Private Access
         ^
2 errors






Interview Question:

----> What if a Constuctor is Made Private?


If you make constructor of a class as Private (Singleton Class) 
----> You CANNOT Create Object/Instance of that class from outside the class

----> You CANNOT Create Child Classes for that Class (No Inheritance)





class Tesla
{
    String name = "Model S"; // Default Access 
    private int speedLimit = 100;
    private void print()
    {
        System.out.println("SpeedLimit: " + speedLimit);
        
    }
    
    private Tesla(){};
}

class Model extends Tesla // Inherting from a Class with Private Constructor
{
    String name = "Model"; // Default Access 
}
    
public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        Model m = new Model();
        System.out.println("Model: " + m.name);
    }
}


OP:


Line 18: error: Tesla() has private access in Tesla [in Main.java]
        Tesla t = new Tesla(); // Constructor
                  ^


Line 14: error: Tesla() has private access in Tesla [in Main.java]
class Model extends Tesla
^





(2) Default


If No Modifier is given to a data meember or member function, 
Then it behaves as default access type



Access Level: Within the Package
It cannot be accessed from Ouside the Package


CODE:

(1) Same Package: Accessible



class Tesla
{
    String name = "Model S"; // Default Access 
    int speedLimit = 100;
    void print()
    {
        System.out.println("SpeedLimit: " + speedLimit);
    }
}
    
public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println(t.name);
        t.print();
    }
}


OP:

Model S
SpeedLimit: 100



(2) Different Package: Not Accessible


--- A.java

package p1

public class A
{
    void print() // default
    {
        System.out.println("Hey!");
    }

}



--- B.java

package p2
import p1


public class B
{
      public static void main(String[] args) 
    {
      A obj = new A(); // No Error, class A -> public
      obj.print(); // CT Error - default access for print() -- Can't be used outside package
    }
}


OP:

Error




(3) Protected


Access Level: Within the Package and Outside the Package ONLY By using Child Class


(1) Same Package: Accessible



class Tesla
{
    protected String name = "Model S"; // Protected Access 
    protected int speedLimit = 100;
    protected void print()
    {
        System.out.println("SpeedLimit: " + speedLimit);
    }
}
    
public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println(t.name);
        t.print();
    }
}


OP:

Model S
SpeedLimit: 100






(2) Different Package: ONLY Accessible Using Child Class


--- A.java

package p1

public class A
{
    protected void print() // protected
    {
        System.out.println("Hey!");
    }

}


--- B.java

package p2
import p1

public class B extends A // B: Child Class
{
  // protected Can Only Be Used Outside Package ONLY from Child Class
    public static void main(String[] args) 
    {
      A obj = new A(); // No Error - class A is public - Accessible Here
      obj.print(); //  No Error - print() is protected - Accessible from Child Class
    }
}


OP:

Hey!





(3) Different Package: Without Using Child Class - NO


--- A.java

package p1

public class A
{
    protected void print() // protected
    {
        System.out.println("Hey!");
    }

}


--- B.java

package p2
import p1

public class B  // B: NOT Child Class
{
  // protected Can Only Be Used Outside Package ONLY from Child Class
    public static void main(String[] args) 
    {
      A obj = new A(); // No Error - class A is public - Accessible Here
      obj.print(); //  CT Error - print() is protected - Accessible from Child Class ONLY
    }
}


OP:

Error





(4) public



Access Level: Everywhere
Within Class: YES
Within Package: YES
Outside Package by Child Class: YES
Outside Package by Object of Same Class: YES





(1) Same Package: Accessible



class Tesla
{
    public String name = "Model S"; // Public Access 
    public int speedLimit = 100;
    public void print()
    {
        System.out.println("SpeedLimit: " + speedLimit);
    }
}
    
public class Main 
{
    public static void main(String[] args) 
    {
        Tesla t = new Tesla(); // Constructor
        System.out.println(t.name);
        t.print();
    }
}


OP:

Model S
SpeedLimit: 100






(2) Different Package: Accessible Using Child Class


--- A.java

package p1

public class A
{
    public void print() // public
    {
        System.out.println("Hey!");
    }

}


--- B.java

package p2
import p1

public class B extends A // B: Child Class
{
  // public Can be Used Outside Package from Child Class
    public static void main(String[] args) 
    {
      A obj = new A(); // No Error - class A is public - Accessible Here
      obj.print(); //  No Error - print() is public - Accessible from Child Class
    }
}


OP:

Hey!





(3) Different Package: Without Using Child Class - YES


--- A.java

package p1

public class A
{
    public void print() // public
    {
        System.out.println("Hey!");
    }

}


--- B.java

package p2
import p1

public class B
{
  // public Can be Used Outside Package from Non-Child Class
    public static void main(String[] args) 
    {
      A obj = new A(); // No Error - class A is public - Accessible Here
      obj.print(); //  No Error - print() is public - Accessible from Non-Child Class
    }
}


OP:

Hey!








TODO: Interview Question on Access Specifiers


