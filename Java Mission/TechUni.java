class collage{
    String collagename;
    collage(String collagename){
        this.collagename=collagename;
    }
}
public class TechUni extends collage{
    String UniName;
    TechUni(String UniName){
        super(UniName);
        this.UniName=UniName;
    }
    static void main(String[] args) {
        collage c= new collage("chavhan");
        System.out.println(c.collagename);
        TechUni s=new TechUni("pushkar");
        System.out.println(s.UniName);
    }
}