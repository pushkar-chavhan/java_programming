public class Eh {
    public static void main(String[] args) {
        try{
            int c=70/0;
            int a[]=new int[3];
            System.out.println(a[10]);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
