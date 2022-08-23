Date : 18th August 2022
Mentor: DEVANG SHARMA
Batch: January Batch - Mixed Batch (JAVA)

Agenda:
- Intro Session: DONE
- Intro To Java: DONE

- JDK, JVM, JRE: 
- Variables and Constants: 
- Objects and Classes
- OOPS

"Please Type 'Hi' in the Chat Box if you have joined and Can See this Screen".





Intro Sesssion:


- Jan Batch
- Pass Out: 2017 - 2022
- Stream: Mixed


DSA 1, DSA 2
HTML, CSS, React


Java: 1-10
Average: 5

End of Course: 9.5-10



----->  Intro to Java:


High Level Languages: (Programming Language)
C++, Java, C, Python, Golang, Scala, Javascript


Conversion?
Compilation: HLL to Machine Code

Machine Code: Binary (0/1)



Flow:

                                Compilation                 Execution

Notepad --- Java Code --> javac Main.java ----> Main.class ------> java Main -----> OP


CODE:


class Main
{
  public static void main(String[] args)
  {
    System.out.println("Devang");
  }
}

File Name == Public Class Name.java


javac Main.java
(Java Compile)

Main.java ----> Main.class (Machine Code)
 
Main.class  ----> Executed

java Main
(Run Java)

OP: "Devang"


Note:
If Compilation is Successful, Machine Code (Main.class) would be generated
Else, It would Not be Generated



Proof:

(1) If Compilation is Successful, ONLY THEN Machine Code (Main.class) would be generated

class Main
{
  public static void main(String[] args)
  {
    System.out.println("Devang")
  }
}


-  javac Main.java

No Main.class file generated

Main.java:5: error: ';' expected
    System.out.println("Devang")

- java Main

Error: Could not find or load main class Main
(Reading from Machine Code NOT from Source Code)



(2) Program Execution is Based Upon Machine Code (.class file) rather than Source Code (.java file)


CODE:

class Main
{
  public static void main(String[] args)
  {
    System.out.println("Sharma");
  }
}


Run Without Compile:
OP: "Devang" - Previous Compiled Code in .class file


Run With Compile:
OP: Sharma







-----> What Happens During Compilation?
(Source Code ---> Machine Code)



- Check for Syntax Errors ({;,})
- Check for Compile Time Errors 
(Calling and Undefined Function, Variable, Scope)
- Allocate Memory to Static Data Structures (Arrays etc)
- Check for Memory Error: MLE
- Check for Arithmetic Exceptions



int a; // 4 Bytes

int arr[100];
Size: 100*4 Bytes --> RAM: Compilation (Contiguous Memory)

int arr[n]
n elements

Index: 0 to n-1 = Total n

int b = 10/0;
System.out.println(b);

OP: Arithmetic Exception - Division by Zero


After Compilation:

(1) Success
Machine Code will be Generated

(2) Error
No Machine Code will be Generated




Execution

Takes the Machine Code (.class file) and Executes it


Flow:

                                Compilation                 Execution

Notepad --- Java Code --> javac Main.java ----> Main.class ------> java Main -----> OP







Programming Languages:
- Compiled Time Languages
- Interpreted Languages





- Compiled Time Languages
C++, C, Java, C#, Scala, Go


All Source Code ---> Machine Code at once


Interpreted Languages:
Python, Javascript

Source Code ---> OP: Interpreted Languages
(1 by 1 Line Execution)





C++/Java/Go (Compiled Language)


100 LOC
---------
System.out.println("Devang");
int a = 4/0;
System.out.println("Sharma");
---------
100 LOC


OP:
Division by Zero Exception


Python/JS (Interpreted Languages)

100 LOC
---------
print("Devang")
a = 4/0
print("Sharma")
---------
100 LOC


OP:

100 LOC
Devang
Error







----> Strict Typed Languages vs Loosely Typed Languages

