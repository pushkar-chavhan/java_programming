public class ExceptionProp {
    void m(){
        System.out.println(10/0);
    }
    void n(){
        m();
    }
    void p(){
        try{
            m();
        }
        catch(Exception e){
            System.out.println("Exception handled"+e);
            System.out.println("hello");
        }
    }
  public static void main(String[] args) {
    ExceptionProp d=new ExceptionProp();
    d.p();
  }  
}
