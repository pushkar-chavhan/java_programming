interface interface4 {
    default void check(){
        add(20,10);
    }
    private static void add(int x,int y){
        System.out.println("Addition is "+(x+y));
    }
    public static void main(String[] args) {
        D d=new D();
        d.sub(34,20);
        d.check();
        add(30, 90);
    }
}
class D implements interface4{
    public void sub(int a,int b){
        System.out.println("Substraction"+(a-b));
    }

}
