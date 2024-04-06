public class Mulcatch2 {
    public static void main(String[] args) {
        try{
            int a[]=new int[4];
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
