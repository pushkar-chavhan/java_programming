public class Rmduplicate {
    public static void main(String[] args) {
        int a[]={1,2,1,2,3,4,3};
        int n=a.length;
       // int uni=a[0];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]!=a[j]){
                   // a[i]=uni;
                    System.out.println(a[i]);
                }
            }
        }
    }
}
