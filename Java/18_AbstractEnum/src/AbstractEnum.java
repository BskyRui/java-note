/**
 * Created by 李锐 on 2015/8/25.
 */
public class AbstractEnum {
    public static void main(String args[]) {
        WeekDay t = WeekDay.SAT;
        System.out.print("SAT 的下一天是: " + t.next());
    }

    // 枚举类
    public enum WeekDay {
        SUN {
            public WeekDay next(){
                return MON;
            }
        },
        MON {
            public WeekDay next(){
                return TUE;
            }
        },
        TUE {
            public WeekDay next(){
                return WED;
            }
        },
        WED {
            public WeekDay next(){
                return THU;
            }
        },
        THU {
            public WeekDay next(){
                return FRI;
            }
        },
        FRI {
            public WeekDay next(){
                return SAT;
            }
        },
        SAT {
            public WeekDay next(){
                return SUN;
            }
        };
        // 抽象方法
        public abstract WeekDay next();
    }
}
