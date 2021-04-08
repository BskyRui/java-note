/**
 * Created by 李锐 on 2015/8/23.
 */

// 重载的两种表现形式 - 重载和覆盖和对象的多态性
// 对象的多态性: 向上转型(自动) ->  父类   父类对象  =  子类实例
//             向下转型(强制类型转换) -> 子类    子类对象  =   (子类) 父类实例

public class Son extends Father{

    // 如果子类重写了父类的方法, Father f = new Son()-> f.say()

    // 会执行子类的方法
    // 被重写的方法不能拥有比父类方法更严格的访问权限

    public void say() {
        System.out.println("i'm son...");
    }

    public void say1() {
        System.out.println("i'm son... say1");
    }
}
