/**
 * Say
 */
public interface Say {

    public String sayable();
}
 class Lamda{
    public static void main(String[] args) {
        Say s=()->{
            return "JAy Shri RAm";
        };
        System.out.println(s.sayable());
    }
    
}