 class Exam {
    static{
        System.out.println("Static Block 1:Exam");
    }
    Exam(){
        System.out.println("Exam Constructor");
    }
    {
        System.out.println("Init Block:Exam");
    }
    static{
        System.out.println("Static Block 2:Exam");
    }
    }
    class MidTerm extends Exam{
        static{
            System.out.println("Static Block 1: MidTerm");
        }
        MidTerm(){
            System.out.println("MidTerm Constructor");
        }
        public String toString(){
            return "MidTerm";
        }
        static{
            System.out.println("Static Block 2:MidTerm");
        }
        public static void main(String[] args) {
            System.out.println("Welcome to Midterm Examition");
            Exam exam=new Exam();
            MidTerm javaProgramming=new MidTerm();
            System.out.println(javaProgramming);     
        }
        {
            System.out.println("Init Block : MidTerm");
        }

    
}
