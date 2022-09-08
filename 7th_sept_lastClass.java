Date : 7th September 2022
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
---> End of Core Java: DONE
- JDBC: DONE
- SQL: DONE
- Spring: DONE
- Spring Boot: DONE
- SQL Joins: DONE

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".






----> Spring Ques:

Spring:

A Lightweight, Loosely Coupled and Integrated Framework for Developing Enterprise Applications in Java

Module: Building blocks of Framework
Framework: Modules Clubbed together


Room: Module
3 BHK Apartment: Framework

Spring
- Framework

Spring Boot
- Module


Frameworks helps to build applications specific to a language

Java -> Spring
Python -> Django
PHP -> Laravel
JS -> React, Vue, Angular


(2) Advantages of Spring?

- Predefined Templates
- Loosely Coupled
- Easier to Test
- Lightweight - Consume Less Resources (Memory/RAM etc)
- Fast Development


(3) Common Modules:

- Test
- AOP
- Data Access
- Web
- Spring Boot


(4) IOC and DI

IOC: Inversion of Control
DI: Dependency Injection


IOC and DI - Design Pattern to provide loose coupling

Loose Coupling - Removes the Dependency among Individual Services


Eg:

public class Employee
{
  Address address;
  Employee()
  {
    address = new Address(); // creating instance
  }
}

Dependency:
- Between Employee and Address Class
- Because Employee if FORCED to Use the Same Address Instance Everytime
- Every Object fo Employee Class will use SAME Instance of Address


Apply IOC and DI:

public class Employee
{
  Address address;
  Employee()
  {
    this.address = address; // No New Instance
  }
}

Now, There is No Dependency between Employee Class and Address Object
- Every Object of Employee Class will Use DIFFERENT Instance of Address





(5) Types of IOC Containers in Spring?

- BeanFactory
- ApplicationContext


POJO:
- Plain Old Java Application
- Stand Alone Application


.Jar Files: 
Nokia Games

- Bouncy Tales
- Snake
- Diamond Rush
- Car Racing





Bean Class: Advanced Version of POJO




Implementation:

Class -1:

Input: 
String, int

OP:

JSON response:
{
  String: " ",
  int: 
}


Class-2:

Input: List<String>, int


OP:

JSON response:
{
  List<String>: " ", " ", " ", " "
  int: 
}


SQL Query

Target: 

BEAN Class: Render Both Response 1 and Response 2







(6) Different Bean Scopes in Spring?

Ans: 5 Bean Scopes in Spring Framework


(1) singleton
- Bean instance will be created only once

(2) prototype
- Bean instance created EACH Time when requested

(3) request
- Bean instance created per HTTP request

(4) session
- Bean instance created per HTTP session

(5) globalsession
- Bean instance created per Global HTTP Session








-----> Spring Boot Ques:


(1) What is Spring Boot?

- Spring Boot is a Spring Module which Provides Fast Development Feature to Spring Feature

Main Purpose:
Used to create STAND ALONE Spring Based Applications


(2) Advantages:

- Create Stand Applications using .jar files
- Embed Tomcat, Jetty Directly
- Automatically Configure Spring
- Provides .pom file to simplify Maven Configuration and to give Dependency\\


Stand Alone Applications:

NOKIA Phones:

Sname Game, Diamond Rush, Bouncy Tales, Car Racing Game etc

snake.jar
diamond.jar


GTA SA/Vice City:

Complete Mission --> Turn off PC --> Not Save

Save Progress in PC --> Upload File and Continue --> Progress Saved



(3) Features of Spring Boot:

- Web Development
- Spring Applications
- Admin Features
- Application Events and Listeners


(4) Annotations in Spring Boot?

Annotations:
- Form of metadata that provides information about a program
- Provides Supplement/Additional Information about a program

@ Symbol: Annotation

(A) @Required

- Used for those values which MUST be initialised/set
- Applies to Bean Setter Method
- Indicates that Annotated Bean Must be Populated at Config Time, Else throw error



Setter --> Initialise the Values


Eg:


public class Employee
{
  private String name;

  @Required
  public void setName(String name)
  {
    this.name = name;
  }

  public void getName()
  {
    return name;
  }
}


If setName() is Not Called -> throws error





Eg:


public class Employee
{
  private String name;

  public void setName(String name)
  {
    this.name = name;
  }

  public void getName()
  {
    return name;
  }
}


If setName() is Not Called -> No Error




(B) @Controller

- Class-Level Annotation
- It makes a CLASS as Web Request Handler
- Used to serve Web Pages


Returns: A String that Indicates which route to Redirect

- Mostly used with @RequestMapping Annotation



Analogy: React

@Controller: Route
@RequestMapping: Prop




Eg:

@Controller
@RequestMapping("employees")
public class EmployeeController
{
  @RequestMapping(value = "/{name}", method = RequestMethod.GET);
}








----> SQL JOINS:


- Join is done on 2 tables or Multiple Tables
- There Must be AT LEAST ONE COMMON COLUMN between the tables to be joibed



Types of Join:
(A) Inner Join
(B) Left Outer Join
(C) Right Outer Join
(D) Full Outer Join


Table-1: Student

Roll No        Name          Class          Marks

1              A              8            100
2              B              10            90
3              C              11            98
4              D              12            87
5              A              19            95



Table-2: StudentDetails

Roll No        Contact      City

1              101          DEL
2              102          LON
3              103          PJB
4              104          MHR
5              105          NY


Common Column: Roll No

Query for Inner Join:

Select Student.Roll No AS Roll_No, StudentDetails.City AS  CITY, Student.Name as NAME
FROM Student INNER JOIN 
StudentDetails
ON
Student.Roll No = StudentDetails.Roll No


OP:


Roll_No        CITY      NAME

1               DEL      A
2               LON      B
3               PJB      C
4               MHR      D
5               NY       A






Query for Left Outer Join:

Select Student.Roll No AS Roll_No, StudentDetails.City AS  CITY, Student.Name as NAME
FROM Student LEFT OUTER JOIN 
StudentDetails
ON
Student.Roll No = StudentDetails.Roll No






Query for Right Outer Join:

Select Student.Roll No AS Roll_No, StudentDetails.City AS  CITY, Student.Name as NAME
FROM Student RIGHT OUTER JOIN 
StudentDetails
ON
Student.Roll No = StudentDetails.Roll No







Query for Full Outer Join:

Select Student.Roll No AS Roll_No, StudentDetails.City AS  CITY, Student.Name as NAME
FROM Student FULL OUTER JOIN 
StudentDetails
ON
Student.Roll No = StudentDetails.Roll No
