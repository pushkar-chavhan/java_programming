/*class A{
	public static void main(String[] args){
		System.out.println("hello");
	}
}
class  B extends A{}
output:--hello*/


/*class Demo  
{  
static int x=1111;  
static  
{  
x=x-- - --x;   
}  
{  
x=x++ + ++x;  
}  
public static void main(String args[])  
{  
System.out.println(x);  
}  
}  
output:--1111-1109==2;
*/


/*class Test {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");//output
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String args[]) {
        Test test = new Test();
        test.print(10);
    }
}
*/
/*class Code
{
    public static void main(String[] args)
    {
        Integer a = 128, b = 128;
        System.out.println(a == b);
  
        Integer c = 100, d = 100;
        System.out.println(c == d);
    }
}
Answer: false true

In the function valueOf() in Integer, the range is -128 (IntegerCache.low) to 127 (IntegerCache.high) so numbers outside this range will not give expected result. Therefore, the objects will value 100 equates to be equal.
?*

public class Test {
	public static void main(String[] args) {
		for(int i=0; 0; i++) {
			System.out.println("Hello World!");
		}
	}
}
output:--Compilation error (incompatable type : int cannnot be converted in boolean)


public class Code {
	public static void main(String[] args) {
		for(int i = 0; i < 1; i++) {
			System.out.println(i+' ');
		}
	}
}
Answer: 32

The answer is a character code as 0 is appended with a character ' ' and the result should be a character so, the character '1' is converted the numeric character code that is 32.

class Code {
    public static void main(String args[]) {   
        System.out.println(value());
    } 
    static int value() {
        return 1;
    } 
}


_________________________________________________________________________________________________________________________


public class Code
{
    public static void main(String args[])
    {
        int y = 08;
        y = y + 2;
        System.out.println(y);
    }
}
Answer: Compilaton error

The code will give the following compilation error:

opengenus.java:5: error: integer number too large
        int y = 08;
                ^
1 error
Any number starting with 0 is considered an octal number which has digits from 0 to 7. So, 08 is invalid and hence, the code will fail to compile.
