public class Overloading2 {
    void sum(int a,double b){
        System.out.println(a+b);
    }    
    void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Overloading2 p=new Overloading2();
        p.sum(78,84);
        p.sum(21,32);
    }
}
