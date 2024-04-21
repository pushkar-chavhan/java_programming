public class Check {
    public static void main(String[] args) {
        try{
            int i=10,j=0,c;
        c=i/j;
        System.out.println(c);
            int a[]={1,2,3};
        System.out.println(a[10]);
        
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception  a){
            System.out.println(a);
        }
        
    }
}
