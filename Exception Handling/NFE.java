//Number format Exception:::::

class NFE {
    public static void main(String[] args) {
        String s ="123";
        try{
            int a=Integer.parseInt(s);
            System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("String"+s+"Cant be converted into integer");
        }
        System.out.println("main method ended");
    }
}
