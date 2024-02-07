package Java_practice;

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
/**
 * 
 */
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }  
}
class Cat extends Dog{
    void mew(){
        System.out.println("mewwww");
    }
}
 class Test2 {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.mew();
        c.bark();
        c.eat();
    }    
}
