/**
 * Created by 李锐 on 2015/8/25.
 */
public class EnumTest {
    public static void main(String args[]) {
        WeekDay t = WeekDay.MON;
        System.out.println("today is " + t);
        System.out.println("today is " + t.name());
        // 在枚举中的序号
        System.out.println("today is " + t.ordinal());
    }

    public enum WeekDay {
        SUN, MON, TUE, WED, THU("周四"), FRI, FAT;
        // 枚举类的构造函数必须放在枚举常量后
        private WeekDay() {
            System.out.println("无参构造函数");
        }
        private WeekDay(String s) {
            System.out.println(s + " 有参数构造函数");
        }
    }
}
