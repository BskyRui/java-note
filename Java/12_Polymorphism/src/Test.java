/**
 * Created by 李锐 on 2015/8/23.
 */
public class Test {
    public static void main(String args[]) {
        Father f = new Son();
        // 如果子类覆盖了父类的这个方法, 就会执行子类的say()方法
        f.say();

        // 静态绑定 -> 编译器知道调用哪个方法, 不存在与实际类型不匹配的现象, 不存在多态问题

        // 动态绑定 -> 在程序运行中, 会根据程序传递的参数不同而调用不同的方法, 有着不确定性, 存在多态问题

    }
}
