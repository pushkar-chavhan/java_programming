package Java_practice;

import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int fact=1;
        for(int i=0;i<n;i++){
            fact=fact*i;
            System.out.println("factorials are:"+fact);
        }
    }
    
}
