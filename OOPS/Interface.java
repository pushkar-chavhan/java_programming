 interface printable {
    void print();
}
interface showable{
    void show();
}

class Interface implements printable,showable {
    public void print(){
        System.out.println("hello");
    }
    public void show(){
        System.out.println("wellcome");
    }
    public static void main(String[] args) {
        Interface s=new Interface();
        s.print();
        s.show();
    }
}
