/**
 * Created by 李锐 on 2015/8/16.
 */
public class Demo {
    public static void main(String args[]) {
        // 能够被修修改不产生新的类
        // StringBuffer 线程安全
        // StringBuilder 有速度优势

        // instanof判断一个对象是否属于一个类
        Integer a = 12;
        System.out.println(a instanceof Integer);

        StringBuffer sbStr = new StringBuffer("test");
        // 追加
        sbStr.append(", java");
        System.out.println(sbStr);

        // 反转字符串
        sbStr.reverse();
        System.out.println(sbStr);

        // 插入字符串
        sbStr.insert(3, "qq");
        System.out.println(sbStr);

        // 替换, start, end
        sbStr.replace(3, 5, "QQ");
        System.out.println(sbStr);

        System.out.println(sbStr.length());

        // 当前容量
        System.out.println(sbStr.capacity());

        // 截取 avaQQj ,tset
        String newS = sbStr.substring(3);
        // QQj ,tset
        String newS2 = sbStr.substring(3, 5);
        // QQ
        System.out.println(newS2);


    }
}
