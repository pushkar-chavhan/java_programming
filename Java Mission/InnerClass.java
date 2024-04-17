public class outer{
    private static int x;//we only take outer class variable as a static and cant take inner class variablee as a static
   public static class inner{
        private int y;
        void show(){
            System.out.println(x+" "+y);
        }
    }
        public static void main(String[] args) {
            outer o=new outer();
            //outer.inner i=outer.new inner() If we dont take inner class private use this

            outer.inner i=new outer.inner();
            o.x=10;
            System.out.println(x);
            i.y=15;
            i.show();
            i.y=15;
        }
    }
