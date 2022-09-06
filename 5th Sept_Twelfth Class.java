Date : 5th September 2022
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











Database:

Table: Student


Roll No        Name          Class          Marks

1              A              10            100

2              B              10            90

3              C              10            98

4              D              10            87

5              A              10            95






(3) WHERE Condition


Syntax:

SELECT col_name
FROM table_name
WHERE condition;


(A) SELECT COUNT(Name) 
FROM Student
WHERE Marks > 95

OP:

COUNT(Name)
2


(B) SELECT DISTINCT COUNT(Name) 
FROM Student
WHERE Marks > 95

OP:

COUNT(Name)
2



(C) Multiple Conditions - Using AND, OR and NOT With WHERE


Syntax:

SELECT col_name
FROM table_name
WHERE condition1 AND/OR/NOT condition2;




Table: Student


Roll No        Name          Class          Marks

1              A              8            100

2              B              10            90

3              C              11            98

4              D              12            87

5              A              19            95




Eg-1:

SELECT Name
FROM Student
WHERE Marks > 95 AND NOT Class = 10


OP:

Name
A
C


Eg-2:

SELECT Name
FROM Student
WHERE Marks > 95 AND Class >= 10 AND Class <= 12


OP:

Name
C




(5) ORDER BY


- ASC: Ascending Order: By Default
- DESC: Descending Order



Syntax:

SELECT col_name
FROM table_name
WHERE ......
ORDER BY col_name ASC/DESC;




Table: Student


Roll No        Name          Class          Marks

1              A              8            100

2              B              10            90

3              C              11            98

4              D              12            87

5              A              19            95


Eg- 1:

SELECT Name
FROM Student
ORDER BY NAME; // OR ORDER BY NAME ASC;

OP:

Name

A
A
B
C
D



Eg-2:

SELECT Name
FROM Student
ORDER BY NAME DESC; 

OP:

Name

D
C
B
A
A



Eg-3:

SELECT Name, Marks
FROM Student
ORDER BY Name, Marks ;  // ORDER BY NAME ASC, Marks ASC;  

OP:

Name      Marks

A          95
A          100
B          90
C          98
D          87



Eg-4:

SELECT Name, Marks
FROM Student
ORDER BY Marks, Name ;  // ORDER BY Marks ASC, Name ASC;  

OP:

Name      Marks

D            87
B            90
A            95
C            98
A            100



Note:

Eg- 1

ORDER BY Name, Marks ;  

Case- 1: If Name is Unique, Continue with Just Increasing Order of Name, Marks WILL NOT Decide the Asnwer

Case- 2: If Name is NOT Unique, Check the Marks, Less Marks will be in top followed by More marks (Ascending Order)


Eg- 2

ORDER BY Name, Marks, Roll No DESC;  

Case- 1: If Name is Unique, Continue with Just Increasing Order of Name, Marks and Roll No WILL NOT Decide the Asnwer

Case- 2: If Name is NOT Unique, Check the Marks, Less Marks will be on top followed by More marks (Ascending Order)

Case- 3: If Name And Marks Are NOT Unique, Check the Roll No, Higher Roll No will be on top followed by Lower Roll No (Descending Order)




(6) NULL and IS NOT NULL Operator


NULL: Check for Empty Values


Note: 
NULL -> Empty Values
'' -> Empty String


String str = "";
String s = null;


Eg:

SELECT Name
FROM Student
WHERE Name IS NOT NULL;

OP:

Name

A
B
C
D
A



(7) Update Query:
- Used to Modify/Update the Existing Record (Row) in a Table



Syntax:

UPDATE table_name
SET col1 = value1, col2 = valu2......
WHERE condition1, condition2....




Table: Student


Roll No        Name          Class          Marks

1              A              8            100

2              B              10            90

3              C              11            98

4              D              12            87

5              A              19            95


Eg-1:

UPDATE Student
SET Marks = 96
WHERE Name = 'B';

OP:

Roll No        Name          Class          Marks

1              A              8            100
2              B              10            96
3              C              11            98
4              D              12            87
5              A              19            95


Eg-2:

UPDATE Student
SET Marks = 96
WHERE Name = 'A';


OP:

Roll No        Name          Class          Marks

1              A              8             96
2              B              10            90
3              C              11            98
4              D              12            87
5              A              19            96


Eg-3:

UPDATE Student
SET Marks = 96
WHERE Name = 'A' AND Roll No = 5;



OP:

Roll No        Name          Class          Marks

1              A              8            100
2              B              10            90
3              C              11            98
4              D              12            87
5              A              19            96




Eg-4:

UPDATE Student
SET Marks = 96;


- Update All Marks to 96

OP:

Roll No        Name          Class          Marks

1              A              8             96
2              B              10            96
3              C              11            96
4              D              12            96
5              A              19            96






(7) Delete Query
- Used for Deleting Rows


Syntax:

DELETE
FROM table_name
WHERE condition1, condition2......





Table: Student

Roll No        Name          Class          Marks

1              A              8            100
2              B              10            90
3              C              11            98
4              D              12            87
5              A              19            95



Eg-1:

DELETE
From Student
WHERE Name = 'A';


OP:

Roll No        Name          Class          Marks

2              B              10            90
3              C              11            98
4              D              12            87



Eg-2:


DELETE
From Student
WHERE Name = 'A' and Marks = 95;

OP:

Roll No        Name          Class          Marks

1              A              8            100
2              B              10            90
3              C              11            98
4              D              12            87


Eg-3:

DELETE
From Student;


OP:

Roll No        Name          Class          Marks


- Delete All Rows, Structure Would Remain




Note:

DELETE: Delete Rows, Structure Would Remain
DROP table_name: Structure would be Deleted as well






(8) TOP/LIMIT

- Fetch Limited Number of Records
- Fecth First K Number of Rows Satisfying the Query on Table


Syntax:

SELECT TOP number | percent col_name
FROM table_name
WHERE condition1, condition2......

      OR


SELECT col_name
FROM table_name
WHERE condition1, condition2......
LIMIT number;





Table: Student

Roll No        Name          Class          Marks

1              A              8            100
2              B              10            90
3              C              11            98
4              D              12            87
5              A              19            95


Eg-1:

SELECT TOP 3 Marks 
FROM Student;

OP:


Marks

100
90
98



Eg-2:

SELECT TOP 3 Marks 
FROM Student
ORDER BY MARKS DESC;

OP:

Marks

100
98
95


Eg-3:

SELECT TOP 3 Name, Marks 
FROM Student
ORDER BY MARKS DESC;



First -> Order By Will Be Executed

Table: Student

Roll No        Name          Class          Marks

1              A              8            100
3              C              11            98
5              A              19            95
2              B              10            90
4              D              12            87

Next -> Top 3 will be Fetched

Name       Marks

A          100
C           98
A           95





(9) Aggregator Functions:
- Count, Count(*), Max, Min, Sum, Avg

Reason - These Queries/Functions are Implemented on Aggregated Data,
         Thats why they its called Aggregator Functions



MAX() - Maximum Value in a Column

Syntax:


SELECT MAX(col_name)
FROM table_name
WHERE condition1, condition2......


MIN() - Minimum Value in a Column

Syntax:


SELECT MIN(col_name)
FROM table_name
WHERE condition1, condition2......


Table: Student

Roll No        Name          Class          Marks

1              A              8            100
2              B              10            90
3              C              11            98
4              D              12            87
5              A              19            95




Eg - 1:
SELECT MAX(Marks) AS HighestMarks
FROM Student;


OP:

HighestMarks
100


Eg - 2:
SELECT MIN(Marks) AS LowestMarks
FROM Student;

OP:

LowestMarks
87



(10) AVG(), SUM(), COUNT()


COUNT: Number of Rows Matching Conditions

SELECT COUNT(col_name)
FROM table_name
WHERE condition;


AVG: Average Value of All Values in a Column

SELECT AVG (col_name)
FROM table_name
WHERE condition;



SUM: Sum of All Values in a Column

SELECT SUM(col_name)
FROM table_name
WHERE condition;





Resources:

(1) Leetcode: Set of SQL Questions (35): Beginner to Advanced
(2) Hackerrank: SQL Coding - Basics to Advanced: Intermediate
(3) W3Schools - Practise SQL : Beginners


