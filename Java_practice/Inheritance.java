package Java_practice;

class Inheritance {
float salary=50000;   
}
class Program extends Inheritance{
int bonus=4000;
public static void main(String[] args) {
    Program p=new Program();
System.out.println("salary is:"+p.salary);
System.out.println("Bonus is:"+p.bonus);
}
}
