class A{
    void showA(){
        System.out.println("I am A");
    }

}
class B extends A  {
    void showB(){
        System.out.println("I am B");
    }

    
}
class C extends B{
    void showC(){
    System.out.println("I am c");
    }
}
class Multi {
    public static void main(String[] args) {
        C p=new C();
        p.showA();
        p.showB();
        p.showC();
    }
}
