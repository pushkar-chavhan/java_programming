abstract class bank {
    abstract int interest();
}
class SBI extends bank{
    int interest(){
        return 10;
    }
}
class ICICI extends bank{
    int interest(){
        return 12;
    }
}
class AXIS extends bank{
    int interest(){
        return 14;
    }
}
class Abstraction {
    public static void main(String[] args) {
        bank b;
        b=new SBI();
        System.out.println("rate of interest in SBI:"+b.interest());
        b=new ICICI();
        System.out.println("rate of interest in ICICI:"+b.interest());
        b=new AXIS();
        System.out.println("rate of interest in AXIS:"+b.interest());
    }
}
