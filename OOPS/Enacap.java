class Emplyee{
    private int Empid;
    public void setid(int id){
        Empid=id;
    }
    public int getid()
    {
        return Empid;
    }
}
public class Enacap {
    public static void main(String[] args) {
        Emplyee e= new Emplyee();
        e.setid(34);
        System.out.println(e.getid());
    }
}
