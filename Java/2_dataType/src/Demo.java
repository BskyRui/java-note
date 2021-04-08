/**
 * Created by 李锐 on 2015/8/6.
 * http://www.ideacolorthemes.org/home/
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("helloworld");
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        String str = "lirui";
        for (int j = 0; j < str.length(); j++) {
            System.out.print(str.charAt(j));
        }

        char b[][] = new char [][]{{'a', 'b'}, {'c', 'd'}, {'e', 'f'}};
        for (int m = 0; m < b.length; m++) {
            for (int n = 0; n < b[m].length; n++) {
                System.out.println(b[m][n]);
            }
            System.out.print("----\n");
        }
    }
}
