public class Throw {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible");
        }
        else{
            System.out.println("Ja vote de Aaa...");
        }
    }
    public static void main(String[] args) {
        validate(9);
    }
}
