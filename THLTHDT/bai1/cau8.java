

package bai1;
import java.util.Arrays;
public class cau8 {
    public static void main(String[] args) {
       
        int[] array = {9,1,5,13,2,8,79,16,90,45};
        Arrays.sort(array);              
        System.out.println("Mang tang dan: ");
        for(int i=0; i<10; i++) {
                System.out.print(array[i] + " ");
        }
    }
}