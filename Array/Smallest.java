public class Smallest {
    public static void main(String[] args) {
        int a[]={2,2,4,5,8,6};
        int n=a.length;
        int min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
