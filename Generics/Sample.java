import java.util.Arrays;  
  
 class FindMax {  
    public static <T extends Comparable<T>> T findMax(T[] arr) {  
        Arrays.sort(arr);  
        return arr[arr.length - 1];  
    }  
  
    public static void main(String[] args) {  
        Integer[] intArr = {1, 5, 3, 2, 4};  
        String[] strArr = {"cat", "dog", "elephant", "bird"};  
  
        Integer maxInt = findMax(intArr);  
        System.out.println("Max Integer: " + maxInt);  
  
        String maxStr = findMax(strArr);  
        System.out.println("Max String: " + maxStr);  
    }  
}  