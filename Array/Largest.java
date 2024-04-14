 class Largest {
    public static void main(String[] args) {
        int a[]={2,4,3,6,8,6};
        int n=a.length;
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            }
            System.out.println(max);
        }
    }

 