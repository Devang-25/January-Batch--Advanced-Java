Date : 24th August 2022
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


- this Keyword


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".









(2) Java static Functions/Methods



Syntax:

static return_type funcName(params)

Eg:

static int sumofNumbers(int a, int b)



Properties:

- Static Method belongs to Class instead of object of class

- Static method can be invoked without creating an object

OR

Static Method can be called using Class name

- Static Method can access/change static data member

- Static Method CANNOT Access or Change Non- static Member or Non-Static Functions

- Non Static Methods CAN Access or Change static Member Static Functions

- Static Functions are Accessed through Class, Hence Only 1 Time in Memory

- Non-Static Functions are Accessed through Objects, Hence Everytime created in Memory as you create objects






CODE:


class Employee
{ 
  int emp_id; // non- static variable
  String name; // non- static variable

  static String companyName = "Google"; // static variable

  Employee(int emp_id, String name)
  {
    this.emp_id = emp_id;
    this.name = name;
  }

  void display() // non- static method
  {
    // companyName = "Facebook"; - NO ERROR, Non static Method can Access and Change Static Variable
    System.out.println("Employee ID: " + emp_id +  " Name: " + name + " Company: " + companyName);
  }
    
  static void changeCompany() // static method
  {
      companyName = "Facebook";
      // name = "Employee"; - ERROR, Static Method CANNOT Access and Change Non-Static Variable
  }
}


class Main
{
  public static void main(String[] args)
  {  
      // Updates for All Objects
    // Employee.changeCompany();
      

    Employee e1 = new Employee(1, "John");
    Employee e2 = new Employee(2, "Cena");

    // Same Company Name - static variable : Common Across All Objects
    // Non Static Method Able to Access Static Variables as well      
    e1.display(); // Non Static Method -- Use By Object Name

    // static method called by Class Name instead of object name        
    Employee.changeCompany();

    // Same Company Name - static variable : Common Across All Objects
    // Non Static Method Able to Access Static Variables as well      
    e2.display(); // Non Static Method -- Use By Object Name
      

    // Static Variable - Use by Class Name
    System.out.println("Company Name: " + Employee.companyName);
  }
}




OP:


Employee ID: 1 Name: John Company: Google
Employee ID: 2 Name: Cena Company: Facebook
Company Name: Facebook





----> Why psvm() not pvm() ?



  public static void main(String[] args)
  {  

  }


  public void main(String[] args)
  {  

  }



JVM: Compiler

If Non-Static,
JVM Need to Create an Object and then invoke main() function using object


Problem: Extra Memory Allocation






(3) static Block

   
Block: Piece of Code under {}

Purpose of static Block:

- Used to initialise static data member
- Executed before the main method


Note: Block has HIGHER Priority than Function        




CODE:


class Main
{
    static {
        System.out.println("Calling Static Block");
    }
    
  public static void main(String[] args)
  {  
    System.out.println("Calling Main Function");
  }
    
}





OP:

Calling Static Block
Calling Main Function



Note:

Execute Without main() method by using just static block()?
- Before JDK 1.6: YES
- After JDK 1.6: NO







-----> this Keyword


this Keyword is used with reference to - Object

(static Keyword is used with reference to - Class)


Usage:

(1) Used to refer current object
(2) Can be used for calling BOTH Members and Methods
(3) this can also be used to call Constuctor





this is used ---> Specific to particular Object
this is not used ---> Common for All Objects






(1) Without using this Instance Variable and local variable: No Default Values (0 and null)



class Employee
{ 
  int emp_id ; // non- static variable
  String name; // non- static variable
    
  Employee(int emp_id, String name)
  {
    emp_id = emp_id; // emp_id = 1
    name = name; // // name = "John"
      
      
    //this.emp_id = emp_id; // e1.emp_id = 1
    //this.name = name; // // e1.name = "John"
  }

  void display() // non- static method
  {
    System.out.println("Employee ID: " + emp_id +  " Name: " + name);
  }
    
}


class Main
{
  public static void main(String[] args)
  {  
    Employee e1 = new Employee(1, "John");
    Employee e2 = new Employee(2, "Cena");

    e1.display(); // Non Static Method -- Use By Object Name
    e2.display(); // Non Static Method -- Use By Object Name      
  }
}




OP:


Employee ID: 0 Name: null
Employee ID: 0 Name: null




(2) Without using this Instance Variable and local variable: Default Values (Same OP for All Objects)



class Employee
{ 
  int emp_id = 5; // non- static variable
  String name = "Person"; // non- static variable
    
  Employee(int emp_id, String name)
  {
    emp_id = emp_id; // emp_id = 1
    name = name; // // name = "John"
      
      
    //this.emp_id = emp_id; // e1.emp_id = 1
    //this.name = name; // // e1.name = "John"
  }

  void display() // non- static method
  {
    System.out.println("Employee ID: " + emp_id +  " Name: " + name);
  }
    
}


class Main
{
  public static void main(String[] args)
  {  
    Employee e1 = new Employee(1, "John");
    Employee e2 = new Employee(2, "Cena");

    e1.display(); // Non Static Method -- Use By Object Name
    e2.display(); // Non Static Method -- Use By Object Name      
  }
}




OP:


Employee ID: 5 Name: Person
Employee ID: 5 Name: Person











(3) Without using this Instance Variable and local variable --> DIFFERENT NAMES
this --> Not Required




class Employee
{ 
  int emp_id = 5; // non- static variable
  String name = "Person"; // non- static variable
    
  Employee(int e, String n) // local variable
  {
    emp_id = e;  // e: 1 -> empId = 1
    name = n;  // n : John -> name: John      
  }

  void display() // non- static method
  {
    System.out.println("Employee ID: " + emp_id +  " Name: " + name);
  }
    
}


class Main
{
  public static void main(String[] args)
  {  
    Employee e1 = new Employee(1, "John");
    Employee e2 = new Employee(2, "Cena");

    e1.display(); // Non Static Method -- Use By Object Name
    e2.display(); // Non Static Method -- Use By Object Name      
  }
}

OP:

Employee ID: 1 Name: John
Employee ID: 2 Name: Cena





(3) Instance Variable and local variable --> SAME NAMES
this --> Required




class Employee
{ 
  int emp_id = 5; // non- static variable
  String name = "Person"; // non- static variable
    
  Employee(int emp_id, String name) // local variable
  {
    this.emp_id = emp_id;  // e1.emp_id = 1
    this.name = name;  // e1.name = John      
  }

  void display() // non- static method
  {
    System.out.println("Employee ID: " + emp_id +  " Name: " + name);
  }
    
}


class Main
{
  public static void main(String[] args)
  {  
    Employee e1 = new Employee(1, "John");
    Employee e2 = new Employee(2, "Cena");

    e1.display(); // Non Static Method -- Use By Object Name
    e2.display(); // Non Static Method -- Use By Object Name      
  }
}




OP:


Employee ID: 5 Name: Person
Employee ID: 5 Name: Person































