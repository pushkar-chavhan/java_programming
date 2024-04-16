public class Duplicate {
    public static void main(String[] args) {
        int a[]={1,2,4,6,3,4,7,2};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }
        
    }
}
