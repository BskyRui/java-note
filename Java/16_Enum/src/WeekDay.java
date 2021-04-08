/**
 * Created by 李锐 on 2015/8/25.
 */

public class WeekDay {
    // 私有构造函数
    private WeekDay(){}

    public static final WeekDay SUN = new WeekDay();
    public static final WeekDay MON = new WeekDay();
    public static final WeekDay TUE = new WeekDay();
    public static final WeekDay WED = new WeekDay();
    public static final WeekDay THU = new WeekDay();
    public static final WeekDay FRI = new WeekDay();
    public static final WeekDay SAT = new WeekDay();

    // 获取字符串
    // 重载toString()方法
    public String toString() {
        if (this == SUN) {
            return "星期日";
        } else if (this == MON) {
           return "星期一";
        } else if(this == TUE) {
            return "星期二";
        } else if(this == WED) {
            return "星期三";
        } else if(this == THU){
            return "星期四";
        } else if (this == FRI){
            return "星期五";
        } else {
            return "星期六";
        }
    }
}
