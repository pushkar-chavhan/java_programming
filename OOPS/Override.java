class bank{
    int interest(){
    return 0;
    }
}
class SBI extends bank{
    int interest(){
        return 8;
        }
}
class ICICI extends bank{
    int interest(){
        return 10;
        }
}class AXIS extends bank{
    int interest(){
        return 12;
        }
}
class Override {
    public static void main(String[] args) {
        SBI s=new SBI();
        AXIS a=new AXIS();
        ICICI i=new ICICI();
        System.out.println("SBI interest rate is:"+s.interest());
        System.out.println("ICICI interest rate is:"+i.interest());
        System.out.println("AXIS interest rate is:"+a.interest());

    }
}
