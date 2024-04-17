abstract class car{
    abstract void fly();
    abstract void drive();
    public void playMusic(){
        System.out.println("Zingalalaa");
    }
}
    abstract class wagaonR extends car{
    public void drive(){
        System.out.println("sanananaaa");
    }
}
 class update extends wagaonR{
    public void fly(){
        System.out.println("Flyeeing");
    }
 }
   public class main{
        public static void main(String[] args) {
            car c= new update();
            c.drive();
            c.fly();
            c.playMusic();
        }
 }
