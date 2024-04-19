import java.util.Scanner;

class student implements Cloneable{
    int rollNum;
    String name;
    student(int rollNum,String name){
        this.rollNum=rollNum;
        this.name=name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args)throws CloneNotSupportedException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=s.nextLine();
        System.out.println("Enter your roll Number");
        int rollNum=s.nextInt();
        student z=new student(rollNum, name);
        System.out.println("---Its original object---");
        System.out.println(z);
        System.out.println("Its hashcode is= "+z.hashCode());
        student z1=(student)z.clone();
        System.out.println("---Its a clonable object---");
        System.out.println(z1);
        System.out.println("Its hashcode is="+z1.hashCode());


    }
}