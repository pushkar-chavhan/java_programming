public class Throw {
    public static void validate(int age)throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Not eligible");
        }
        else{
            System.out.println("Ja vote de Aaa...");
        }
    }
    public static void main(String[] args)throws ArithmeticException{
        try{
            validate(9);
        }
        catch(ArithmeticException a){
            System.out.println(a);
        }
       
        System.out.println("hello");
    }
}
