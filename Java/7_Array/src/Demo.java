/**
 * Created by 李锐 on 2015/8/16.
 */


import java.util.Arrays;
public class Demo {
    public static void main(String args[]) {
        // int arr []  - -!!!
        int[] arr = {1, 2, 3, 0, -3, -22, 32};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // foreach
        for (int v: arr) {
            System.out.println(v);
        }



        // Array类
        Integer[] a = {2, 3, 5, 9, -1};
        Arrays.sort(a);
        //System.out.println(a);
        for (int v: a) {
            System.out.println(v);
        }
    }
}
