import java.io.File;

class FileInfo{
    public static void main(String[] args) {
        File f= new File("pc.txt");
        if(f.exists()){
            System.out.println("File lenth"+f.length());
            System.out.println("It is readable"+f.canRead());
            System.out.println("path"+f.getAbsolutePath());
        }
    }
}