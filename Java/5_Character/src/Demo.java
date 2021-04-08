/**
 * Created by 李锐 on 2015/8/16.
 */
public class Demo {
    public static void main(String args[]) {
        // 是否是一个数字字符
        System.out.println(Character.isDigit('a'));
        // 是否是一个字母
        System.out.println(Character.isLetter('a'));
        // 是否是一个大写字母
        System.out.println(Character.isUpperCase('A'));
        // 是否是一个小写字母
        System.out.println(Character.isLowerCase('a'));

        // 指定字母的大写形式
        System.out.println(Character.toUpperCase('a'));

        // 返回字符的字符串形式, 长度1
        System.out.println(Character.toString('a').length());
    }
}
