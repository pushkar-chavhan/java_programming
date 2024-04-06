public class MulTry {
    public static void main(String[] args) {
        try{
            try{
                int a[]=new int[5];
                System.out.println(a[10]);
            }
            catch(ArrayIndexOutOfBoundsException v){
                System.out.println(v);
            }
            try{
                int c=50/0;
            }
            catch(ArithmeticException  s){
                System.out.println(s);
            }
        }
        catch(Exception d){
            System.out.println(d);
        }
       
        System.out.println("Main method ended");
    }
}
