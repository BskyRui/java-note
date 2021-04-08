/**
 * Created by 李锐 on 2015/8/23.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;


// 首先要使用Pattern编译字符串正则, 创建一个Pattern对象
public class Demo {
    public static void main(String args[]) {
        String str = "This order was placed for QT3000! OK?";
        String pat = "(.*)(\\d+)(.*)";
        Pattern r = Pattern.compile(pat);

        // 获得匹配对象
        Matcher m = r.matcher(str);
        if(m.find()) {
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        } else {
            System.out.println("no match");
        }
    }
}
