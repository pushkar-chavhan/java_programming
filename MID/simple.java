 class simple {
    int balance =123;
    public simple(){
        this(5);
        balance=324;
        System.out.println("default");
    }
    public simple(int balance){
        System.out.println(balance);
        balance=balance;

    }
    public static void main(String[] args) {
        simple w;
        simple s=new simple(23);
        simple s1=new simple();
        System.out.println(s.balance);
    }
}
