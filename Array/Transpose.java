public class Transpose {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int rows=a.length;
        int col=a[0].length;
        int t[][]=new int[col][rows];
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                t[i][j]=a[j][i];
            }
        }
        System.out.println("Transpose of a matrixx is::::");
        for(int i=0;i<col;i++){
            for(int j=0;j<rows;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
       
    }
}
