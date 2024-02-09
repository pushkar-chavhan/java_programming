 class Overloading {
    void show(int a,int b){
        System.out.println(a+b);
    }
    void show(double a,double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.show(1, 98);
        o.show(4.54, 7.65);
    }
}
