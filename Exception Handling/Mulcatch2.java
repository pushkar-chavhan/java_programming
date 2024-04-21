public class Mulcatch2 {
    public static void main(String[] args) {
        try{
            int a[]=new int[4];
            System.out.println(a[10]);
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
