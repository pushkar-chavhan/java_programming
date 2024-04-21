public class prac1 {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        int c;
        try{
            c=i/j;
        }
        catch(ArithmeticException e){
            int d=i/j;
            System.out.println(e);
        }
        catch(Exception s){
            System.out.println(s);
        }
        
    }
    
}
