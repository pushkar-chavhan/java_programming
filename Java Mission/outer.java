public class outer{
    private static int x;//we only take outer class variable as a static and cant take inner class variablee as a static
   private static class inner{
        public static int y;
        void show(){
            System.out.println(x+" "+y);
        }
    }
        public static void main(String[] args) {
            outer o=new outer();
            //outer.inner i=o.new inner() ;
          outer.inner i=new outer.inner();//for static inner class
            o.x=10;
            System.out.println(x);
            i.y=15;
            i.show();
            i.y=15;
            System.out.println(args[0]);
        }
    }
