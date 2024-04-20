public class Matrix3DAdd {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{1,2,3}};
        int b[][]={{7,8,9},{6,7,8},{4,3,1}};
        int c[][]={{7,8,9},{6,7,8},{4,3,1}};
        int d[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                d[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
        
            System.out.println();
        }
    }
}
