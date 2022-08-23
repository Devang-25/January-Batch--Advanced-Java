Date : 19th August 2022
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






----> Strict Typed Languages vs Loosely Typed Languages




Compiled Languages --> Strictly Types Languages
C++, C#, Java, Go 

Each Literal (Variable/Constant) is Associated with a data type which is checked till Program End



int var = 10;

For  Complete Program flow, 
var will only have integer values



Interpreted Languages ---> Loosely Typed Languages 
Python, Javascript


a = "Devang";
typeof(a);
'string'

a  = 10;
typeof(a);
'number'



int a = 10;

Whenever Assignment (=) is Used, 
Its Always RHS is Assigned to LHS


CODE:


public class Main {
    public static void main(String[] args) {
        int val = "devang";
        System.out.println(val);
    }
}


Line 3: error: incompatible types: String cannot be converted to int [in Main.java]
        int val = "devang";
                  ^


RHS to LHS Assignment




CP Trick:

Sum of Array:


int sumOfArray(int[] arr, int n)
{
  int sum = 0;
  int i = 0;

  for (i=0; i<n; i++) 
  {
    sum = sum + arr[i]; // TLE

    /*

    Copy of sum is created, then added to arr[i], then assigned to sum  (RHS to LHS) - Happens N Times
    TC: O(N)
    
    */

    sum += arr[i]; // Pass all TC

    /*

    No Copy is created, Directly Added arr[i]
    TC: O(1)

    */
  }

  return sum;
}


CP: Helpful


Order of Evaluation in Decreasing Speed:

++i
i++
i += 1
i = i+1






Java Compiler:

Macintosh, Linux, Windows: Environment
--> All Systems


Why System Dependent?
 
Window ---> .class file

That .class file generated on Window can ONLY be executed on Windows



"James Gosling"
- Create a Language which is compatible across all platforms

"Write Once, Run Everywhere"
- 1998


JVM: Java Compiler/ Java Virtual Machine
JRE: Java Runtime Environment

JVM: Java Compiler: Used to Generate .class file
JRE: Virtual Environment: Runs .class file on EVERY Operating System

JVM + JRE: Sufficient to Run Java Program on EVERY Operating System

JDK = JVM + JRE

JDK = Java Development Kit







