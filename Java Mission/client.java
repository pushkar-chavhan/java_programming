//---------------------------------------------------------------Interface Variable-------------------------------------------------------------------------------------
public interface client {
    int amt=10;
    void purchase();
}
class cus implements client{
     public void purchase(){
        System.out.println("hi"+amt+"Good");
    }
}
class demo{
    public static void main(String[] args) {
        cus c=new cus();
        c.purchase();
        System.out.println(client.amt);
    }
}