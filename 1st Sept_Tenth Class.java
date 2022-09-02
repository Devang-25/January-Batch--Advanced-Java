Date : 1st September 2022
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

- JDBC
- Spring
- Spring Boot
- SQL

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".








Order of RESTRICTIVENES:

public < protected < default < private



Order of Freedom/Previlige in Usage:

public > protected > default > private





Answer: "Child Should Have More Access than Parent"


class Tesla
{
    protected void print()
    {
        System.out.println("Inside Parent");
    }
}

class Model extends Tesla// Child Class
{
    void print()
    {
        System.out.println("Inside Child");
    }
}
    
public class Main 
{
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.print();
    }
}



OP: Error




Reason:


Parent:

    protected void print()
    {
        System.out.println("Inside Parent");
    }


Child: Method Which is Overriding the Parent Class

    [default] void print()
    {
        System.out.println("Inside Child");
    }


        Model m = new Model();
        m.print();


Error:

Line 11: error: print() in Model cannot override print() in Tesla [in Main.java]
      void print()
           ^
  attempting to assign weaker access privileges; was public



"Child Function (Overriding Function) MUST Have More Access privileges than Parent Function with Same Name (Overridden Function)"



Order of RESTRICTIVENES:

public < protected < default < private








Success Case:

class Tesla
{
     void print()
    {
        System.out.println("Inside Parent");
    }
}

class Model extends Tesla// Child Class
{
     public void print()
    {
        System.out.println("Inside Child");
    }
}
    
public class Main 
{
    public static void main(String[] args) 
    {
        Model m = new Model();
        m.print();
    }
}



OP:

Inside Child












---> JDBC

JDBC: Java Database Connectivity

(1) API to connect and Execute the Query with DB
(2) JDBC API Uses Drivers to connect with the Database



API:

Application Programming Interface

- Interface to Connect between Client (Front End) and Server (Back End)


Client-Server Architecture:

Client: Make A Request
Server: Serves the request with a response
API: Passing Response from Server to Client


Eg:

Browser -> Gmail -> Login

Client: Browser

Req:
{
  username: abc@gmail.com
  PW: test 

  meta: headers, location etc
}


Server: Gmail Server


Response:
{
  success (200), non success (404)
}


API: Gmail API
- Passing Response from Server to Client


/users/v1/login

API:

GET: Read
POST: Use New data
DELETE: Delete data
PATCH: Update 1 instance of data
PUT: Update data

Live Example- Leetcode



Real Life Example:


If you walk into Dominos:

Request: Large Cheese Pizza

Client: Makes a Request: Customer

Server: Serving the Request/Giving a Response: Chef in Kitchen

API: Bringing Response (Pizza) from Server (Chef) to Client (Customer): Waitor




            Response
Client <------- API <------- Server
|                           /|\
|____________________________|
           Request



API:

- Can Provide Query, Connect and Transfer of Data
- API Can be used to connect any 2 Softwares






(3) JDBC Drivers - 4 Drivers :

- JDBC- ODBC Bridge Drivers
- Native Driver
- Network Protocol Driver
- Thin Driver



Workflow Diagram:

                      Request
Java Application   -----> JDBC API ------> JDBC Driver -----> Database
     /|\                                                        |
      |                                                         |
      |_________________________________________________________|
                                Response


Using JDBC API,
A Java Application can connect to Database using JDBC Drivers


Operations on Database: (CRUD)

CRUD: Create, Read, Update, Delete

- Save
- Update
- Fetch
- Delete




class resp
{
  String name;
  String location;
}


Object resp = jdbc.connect(getlocation(userID));

Response:
{
  name: devang
  location: California
}



Databases:

(1) SQL DB (Relational DB)


Roll No        Name         Class          Contact      Address

1               A           10             909090        London

2               B           10             909091        Glasgow    

....................................



- Every Data will follow the EXACT SAME Structure
- Cannot Create Additional Field (Column) for a particular data (row)
- Cannot Delete existing Field (Column) for a particular data (row)


Eg: SQL, MS Access, Microsoft SQL, Oracle DB, Postgres, Dynamo DB




(2) NoSQL DB / Non-Relational DB

- Key-Value
- Document
- Graph


Eg:

MongoDB (Key-Value), Cassandra
Neo4J (Graph), Amazon S3, HDFC, Gluten etc


Eg:

{
  name: A,
  grade: 10,
  contact: 90909090
},

{
  name: B,
  grade: 10,
  contact: 90909090
  location: London
},

{
  name: C,
  grade: 10,
}










-----> ODBC vs JDBC

ODBC: Open Database Connectivity
JDBC: Java Database Connectivity


Before JDBC,
ODBC API ---> Connect and Execute query with Database


ODBC API ----> Driver ----> Database


Driver for ODBC:
C Language (Platform Dependent)

malloc() and free() 


Java: Garbage Collection

System.gc();


Hence, JDBC API was Introduces


JDBC API ----> Driver ---> Database


Using JDBC API:
- Connect to Database
- Execute Queries and Update Statements
- Retrieve Results from Database






----> Important Interview Questions from JDBC:


(1) How it performs - Workflow Diagram- DONE

(2) JDBC Drivers:

A JDBC Driver is a Software which allows Java Application to connect and interact with Database

4 Types:

- JDBC- ODBC Bridge Drivers: DONE
- Native Driver
- Network Protocol Driver
- Thin Driver


(A) JDBC- ODBC Bridge Drivers

- This Driver uses ODBC Drivers to connect to database
- This JDBC-ODBC Bridge Converts JDBC Method Calls into ODBC Function Calls
- Not used nowadays more, Thin Drivers are Preferred




Workflow Diagram:



                      Request
Java Application   -----> JDBC API ------> JDBC-ODBC Bridge Driver -----> ODBC Driver  -----> Database
     /|\                                                                                        |
      |                                                                                         |
      |_________________________________________________________________________________________|
                                Response




Advantages:

- Easy to Use
- Can be Easily Connected to ANY Database


Note:
ODBC Supports More Databases than JDBC


Disadvantages:
- Performance Degraded: JDBC Method Calls --> ODBC Function Calls
- ODBC Driver needs to be installed on Client Side



