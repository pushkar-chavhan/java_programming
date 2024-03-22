 class Const {
    int balance=123;
    static String surname;
    static boolean status;
    public Const(){
        this;
        balance=12;
        System.out.println("default");
    }
    Const(int a){
        System.out.println("parawala");
        

    }
    public static void main(String[] args) {
        Const c=new Const();
        System.out.println(c.balance);
    }
}
