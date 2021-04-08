/**
 * Created by 李锐 on 2015/8/24.
 */

// 1. 规定了类必须要实现这些抽象方法, 是一个规范
// 2. 接口由全局常量和公共的抽象方法组成
// 3. 接口不能包含成员变量，除了static和final变量
// 4. 没有构造方法
// 5. 不能用于实例化对象
// 6. 接口是隐式抽象的, 不必显式声明abstract
// 7. 方法也是隐式抽象的, 不必显式声明abstract
// 8. 方法都是public【全局常量和公共抽象方法】
// 9. 可以使用extends来继承父接口, 多重继承
// 10. public class className implements 接口名称, 接口名称 来(多)实现
// 11. 一个子类可以同时继承抽象类和实现接口
// 12. 一个接口只能继承一个抽象类

// 接口和抽象类的区别
// 1. 都不能实例化
// 2. 可以用来声明变量, 通过变量指向子类或实现类的对象, 来创建对象实例
        //Student s = new Teacher();
// 3. 抽象类可以拥有实例字段, 接口只能有静态变量
// 4. 接口方法默认public, 抽象类必须手动声明访问控制符



public class Teacher implements Student{
    public void name() {
        System.out.print("my name is lirui...");
    }

    public void say() {
        System.out.print("i can say hello...");
    }
}
