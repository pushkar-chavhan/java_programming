package Java_practice;
class Demo{
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("Enter roll and marks");/**
 * InnerSingle
 */
    }
}
 class sub extends Demo{
    void display(){
        roll=1;name="pushkar";
    }
}
class Single{
    public static void main(String[] args) {
        sub s=new sub();
        s.input();
        s.display();
    }
}
