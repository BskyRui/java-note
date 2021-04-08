/**
 * Created by 李锐 on 2015/8/13.
 */
public class Number {
    public static void main(String args[]) {
        // System.out.println("hello, cpp");
        int a = 10;
        Integer b = 20;
        char c = 'c';
        String d = new String("hello");
        System.out.println(b.equals(a));
        System.out.println(b.compareTo(5)); // 1 >, 2 <
        System.out.println(b.valueOf(c)); // 99

        String e = "lirui, rainbow...";
        System.out.println(e);

        Integer n = 2000;
        System.out.println(n.parseInt("12789"));
        System.out.println(Integer.parseInt("12431"));

        float f = 1.122f;
        double dou = 1.23;
        long l = 10000000323232l;


        //System.out.println(dou.ceil(2.3));
        String str = String.valueOf(1);
        System.out.println(str.charAt(0));

        Integer test = 1000;

        System.out.println(test.parseInt(test.toString()));

        System.out.println(Integer.max(1, 3));



    }
}
