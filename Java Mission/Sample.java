public class Sample {
    public static void main(String ...args) {
        try{
        System.out.println(args[0]);
        }
        finally{
            System.out.println("inside finally");
        }
    }
}
