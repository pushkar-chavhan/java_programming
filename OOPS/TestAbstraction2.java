abstract class Animal{
    Animal(){
        System.out.println("ham sb animal hai");
    }
    abstract void sound();
}
class dog extends Animal{
    dog(){
        super();//for printing abstract class constructor
    }
    void sound(){
        System.out.println("Dogs are barking");
    }
}
class TestAbstraction2 {
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
    }
    
}