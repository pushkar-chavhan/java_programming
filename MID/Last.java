 class Last {
   static int x=534;
   static{
    System.out.println("first static block");
   }
   static Last l3=new Last();//if we take this then init and constructor block execute before last static block
    {
        System.out.println("inside init block---"+this);
        x=123;
        System.out.println(x);
    }
    Last(){
        System.out.println("inside constructor---"+this);
    }
    class B{
        static{
            System.out.println("vegla class");
        }
    public static void main(String[] args) {
        B b=new B();
        Last l=new Last();//first static block not print
        System.out.println("inside main"+x);
        l=new Last();
        System.out.println(Last.x);
        Last.displayX();
        System.out.println(l);
    }
}
    static{
        System.out.println("inside last static block");
    }
    public static void displayX(){
        System.out.println(x);
    }
}
