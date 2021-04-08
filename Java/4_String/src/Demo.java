/**
 * Created by 李锐 on 2015/8/16.
 */
public class Demo {
    public static void main(String args[]) {
        System.out.println("hello, world.");
        String str = "BskyRui,y";

        System.out.print(str + ", Rainbow.");

        // 最右边出现的索引, 还是从左边开始
        System.out.println(str.lastIndexOf('y'));
        // 指定位置, 反向搜索, -1 没找到
        System.out.println(str.lastIndexOf('y', 3));

        // 字符串长度
        System.out.println(str.length());

        // 忽略两边的空白
        String strA = "lirui ";
        System.out.println(strA.trim());

        // 转换为字符数组
        char cA[] = strA.toCharArray();
        System.out.println(cA);

        System.out.println(strA.hashCode());

        System.out.println(" lirui ".trim());
    }
}
