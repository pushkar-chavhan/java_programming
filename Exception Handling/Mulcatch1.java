public class Mulcatch1 {
    public static void main(String[] args) {
        try{
            int a[]=new int [5];
            int b=50/0;
        }

        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
        catch(ArithmeticException w){
            System.out.println(w);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
