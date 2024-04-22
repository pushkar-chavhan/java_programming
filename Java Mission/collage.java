public  class collage{
    String collagename;
    collage(String collagename){
        collage.this.collagename=collagename;
    }
   public static class department{
        String deptName;
        department(String deptName){
            this.deptName=deptName;
        }
        public static void main(String[] args) {
             collage c= new collage("chavhan");
            // System.out.println(c.collagename);
            department f=new department("IT");
          //  TechUni s=new TechUni("pushkar");
           // System.out.println(s.UniName);
            //department f=new department("kbs");
            System.out.println(f.deptName);
            System.out.println(c.detail());
        }
    }
    String detail(){
        return "collagename"+collagename+"Department name";
    }
}
//  class TechUni extends collage{
//     String UniName;
//     TechUni(String UniName){
//         super(UniName);
//         this.UniName=UniName;
//     }
// }
    
    
