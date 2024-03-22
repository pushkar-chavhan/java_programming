class Father {
    int bal=34225;
    static String name="munna";
    static boolean status;
    public static void main(String[] args) {
        int bal=745;
        Father f=new Father();
        System.out.println(f.name);
        System.out.println(Father.name);
        System.out.println(f.bal);
        System.out.println(f.status);
        Father s=new Father();
        s.bal=3432;
        System.out.println(s.bal);
        System.out.println(f.bal);
        //System.out.println(Father.bal);
        Father a=new Father();
        System.out.println(a.fun(2,3));
        System.out.println(a.fun(7,3));
        System.out.println((Integer.MAX_VALUE));
        System.out.println(a);
        Father sun=new Father();
       // System.out.println(a.fun(12,"sgss",34));
    }
    // public int fun(int a,String s,int ...b){
    //     System.out.println(a);
    //     return 0;
    // }
    // public int fun(int a,int ...b){
    //     System.out.println(a);
    //     System.out.println(b[0]+b.length);
    //     return 0;

    // }
     public int fun(Father b){
        System.out.println(b);
        return b.bal;
    }
    public long fun(long a,int b){

        return a+b;
    }
    public int fun(int b,int a){

        return a+b;
    }
}
