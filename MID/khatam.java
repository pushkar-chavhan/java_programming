 class collage{
    static int collageId=243;
    {
        System.out.println("inside collage init block---"+this);
    }
    static{
        System.out.println("inside collage static block---");
    }
    collage(){
        System.out.println("inside collage constructor---"+this);
    }
}
class sggs extends collage{
    static int x=625;
    int y=43;
    static{
        System.out.println("class madhla stattic");
    }
    {
        System.out.println("inside sggs init block---"+this);
    }
    sggs(){
        System.out.println("inside sggs constructor---"+this);
    }
    public static void main(String[] args) {
     System.out.println("inside main");
        sggs s=new sggs();
        System.out.println("Default toString() returns--"+s);
       // System.out.println("class toString() return--"+s.myString);
        System.out.println(s);
        sggs s1=new sggs();
        System.out.println(collage.collageId);
        s1=new sggs();
        // {
        //     System.out.println("main init block---"+this);
        // }
    }
    static{
        System.out.println("static at last");
    }
    // public String myString(){
    //     return "y= "+y;
    //     return " "+getClass();
    // }
    // public String toString(){
    //     return " "+getClass().getName()+Integer.toHexString(collageId)+"@"+hashCode();
    // }
    public String toString(){
        return "hi";
    }
}
