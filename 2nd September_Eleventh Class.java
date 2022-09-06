Date : 2nd September 2022
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

- SQL: WIP
- Spring
- Spring Boot


"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".







4 Types:

- JDBC- ODBC Bridge Drivers: DONE
- Native Driver: DONE
- Network Protocol Driver: DONE
- Thin Driver: DONE





(B) Native API Driver (Partially Java Driver)

- Used the Client-Side Libraries of the Database
- Converts JDBC Call ---> Native Calls of Database API
- NOT Written Completely in Java (Partially Java Driver)



Workflow Diagram:



                  Request
Java Application   -----> JDBC API ------> Native API Driver -----> Native DB Calls  -----> Database
     /|\                                                                                        |
      |                                                                                         |
      |_________________________________________________________________________________________|
                                Response




Advantages:
- Performance Better than JDBC-ODBC Bridge Driver

Disadvantages:
- The Native Driver needs to be installed on Client Side






(C) Network Protocol Driver (Fully Java Driver)


- Uses Middleware (Application Server Layer) that converts JDBC Calls into Specific Client Protocol
- Completely Written in Java (Fully Java Driver)




Middleware:
Software that lies between an OS and the Applications running in it



Eg:

OS ----------------------    Middleware   ------------- Applications
(Windows/Mac/iOS/Android/Blackberry)



Workflow Diagram:



                  Request
Java Application   -----> JDBC API ------> Network Protocol Driver -----> Middleware  -----> Database
     /|\                                                                                        |
      |                                                                                         |
      |_________________________________________________________________________________________|
                                Response





Real Life Example:


100 Features

India: 90 Features
UK: 100 Features




Google Maps: Live View


Chennai: 3 Weeks Ago
2022: Aug

2008: USA
2010: UK


Based on Geolocation,
Few features Are Accesible for particular Geo Locations.





Fin-Tech/Tech Companies are Subjected to Govt Compliances as per Geo Location

Eg: Tiktok - Not Allowed in India


Eg:

In India, Use Paypal - Transfer Money from Paypal Wallet - Savings Account: 24 Hrs

Solution:

At Middleware: Decide Supporting Functionalities


{
  country: India,
  OTP: yes,
  SMS: yes,
  Email: yes,
  transfer_to_saving: yes
}


{
  country: UK,
  OTP: yes,
  SMS: yes,
  Email: yes,
  transfer_to_saving: no
}




Advantages:
- No Client Side Changes Required


Disadvantages:
- Requires DB Specific Manipulations/Coding to be done in Middleware







(4) Thin Driver (Fully Java Driver)


- Converts JDBC Calls directly into DB Calls
- Optimised Version of Network Protocol Driver
- Completely Written in Java




Workflow Diagram:



                  Request
Java Application   -----> JDBC API ------> Thin Driver  -----> Database
     /|\                                                           |
      |                                                            |
      |____________________________________________________________|
                                Response




Advantages:
- BEST Performance than All Other Drivers
- No Software Installation required at Client Side or Server Side

Disadvantages:
- Driver Depends on Database










-------> Steps to connect to the Database (5 Steps)

5 Steps to connect any Java Application with Database using JDBC:


(A) Register the Driver Class for specific DB

Performed Using forName()


Eg:

Class.forName("oracle.jdbc.driver.OracleDriver");


(B) Create Connection

Preformed using getConnection()

Eg:

Connection con = DriverManager.getConnection(jdbc:oracle:thin@localhost:8080, "user", "password");


(C) Create Statement Objects (SQL DB - Accessed By Statements)

Performed Using createStatement()

Eg: 

Statement stmt = con.createStatement();


(D) Execute Queries

Performed Using executeQuery()

Eg:

String query = "SELECT * FROM EMPLOYEES";
Result res = stmt.executeQuery(query);

OR

Result res = stmt.executeQuery(SELECT * FROM EMPLOYEES);


(E) Closing Connection


Performed Using close()

Eg:

con.close();











------> SQL:


Rating: 1-10
Average: 5-6

Target: 9-10


- Structured Query Language
- Access and Manipulate DB


What is it Used for?

- Execute Queries
- Get, Update, Create, Delete (CRUD)
- Triggers
- Procedures
- Views
- Joins





Database:

Table: Student


Roll No        Name          Class          Marks

1              A              10            100

2              B              10            90

3              C              10            98

4              D              10            87

5              A              10            95



Rows: Horizontal Values - Records
Columns - Vertical Values - Fields

Queries: NOT Cases Sensitive


(1) Select Query

Syntax:

SELECT col_name FROM table_name;

Eg:

(A) SELECT Name FROM Student;
          OR
  select Name from Student;


OP:

Name

A
B
C
D
A






(B) Using Alias (Another Name)

SELECT Name AS STUDENT_NAME FROM Student;

OP:

STUDENT_NAME

A
B
C
D
A






(C)  SELECT Roll No, Name FROM Student;


OP:

Roll No        Name
1              A 
2              B 
3              C 
4              D 
5              A 




(D) SELECT * FROM Student;

*: Asterisk - Getting All Values

OP:

Roll No        Name          Class          Marks
1              A              10            100
2              B              10            90
3              C              10            98
4              D              10            87
5              A              10            95






(2) DISTINCT Keyword


Eg:

(A) SELECT Name from Student; 

OP:


Name

A
B
C
D
A


(B) SELECT DISTINCT Name from Student;


OP:


Name

A
B
C
D

(C) SELECT COUNT(Name) FROM Student;

OP:

COUNT(Name)
5



(D) SELECT COUNT(DISTINCT Name) FROM Student;

OP:

COUNT(DISTINCT Name)
4
