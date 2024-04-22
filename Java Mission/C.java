//---------------------------------------------------------------------Interface Methods---------------------------------------------------------------------------
/**
 * Interface2
 */
interface A{
    void webdev();
    void webdesign();
    int v=20;
}
abstract class B implements A{
     int d=10;
    public void webdev(){
        System.out.println("Hello baccho");
    }
}
 public class C extends  B{

    public void webdesign(){
        System.out.println("kaisee ho");
    }
    public static void main(String[] args) {
        C s=new C();
        System.out.println(A.v);
        System.out.println(s.d);
        s.webdesign();
        s.webdev();
    }
}