/**
 * Created by 李锐 on 2015/8/16.
 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Demo {
    public static void main(String args[]) {
        Date dateA = new Date();
        System.out.println(dateA);
        // 时间戳毫秒数
        System.out.println(dateA.getTime());

        Date dateB = new Date("2013/05/05 23:00:00");
        // A 是不是在 B的后面
        System.out.println(dateA.after(dateB));
        // B 是不是在 A的前面
        System.out.println(dateB.before(dateA));

        // 格式化时间
        SimpleDateFormat t = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(t.format(dateA));

        // 将字符串转为时间
        String dateC = "2014-05-05 12:30:22";
        SimpleDateFormat t2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date tDate = t2.parse(dateC);
            System.out.println(tDate);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
