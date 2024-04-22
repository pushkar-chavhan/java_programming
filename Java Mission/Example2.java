class Example2 {
    public static void main(String ...args) {
        Thread.sleep(1000);
        try{
            Thread.sleep(1000);
            System.out.println("Try1");
            Thread.sleep(1500);
            System.out.println("Try2");
            System.out.println(args[0]);
            Thread.sleep(1000);
            System.out.println("Try3");
        }
        catch(Exception i){
            System.out.println("inside Interrupted");
        }
        finally{
            System.out.println("Inside Finally");
        }
        try{
            System.out.println(30/0);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Inside AIOBE");
        }
        
       
    }
}
