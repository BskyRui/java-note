/**
 * Created by 李锐 on 2015/8/23.
 */
public class Demo {
    public static final int age = 1;

    // 1.final修饰类不能被继承
    // 2.final修饰方法时不允许被覆盖(重写)
    // 3.final修饰属性的时候必须显式的进行赋值或者在构造函数中初始化
    // 4.final修饰变量的时候必须初始化,也就是常量

    /*
    Demo() {
        this.age = 2; // 不知道为什么在1.8中不可以...
    }
    */

    public class Inner {
        // 成员内部类
        public void show() {
            System.out.println("inner");
        }
    }

    public static void main(String args[]) {
        // 创建外部类
        Demo d = new Demo();
        // 创建内部类
        Inner i = d.new Inner();
        i.show();
        //System.out.println("hello");


        // 匿名内部类
            // -> Person必须已经存在, 可以用与接口上
            // http://www.cnblogs.com/nerxious/archive/2013/01/25/2876489.html
        Person p = new Person() {
            // 实现抽象类的方法
            public void say() {
                System.out.print("hello, ");
            }
        };

        p.say();

    }

    // 静态内部类
        // -> 在成员内部类加上了static修饰, 在创建内部类的时候直接 Inner i = new Inner();
    // 方法内部类(局部内部类)
        // -> 方法内部类就是内部类定义在外部类的方法中，只能在该方法内局部可以使用。

}
