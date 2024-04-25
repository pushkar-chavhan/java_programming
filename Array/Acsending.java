import java.util.Scanner;

public class Acsending {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int temp;
        System.out.println("Enter Array Size:");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Your array is::");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
