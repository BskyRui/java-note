/**
 * Created by 李锐 on 2015/8/23.
 */

 // 访问权限
// private <  default(同包) < private(不同包的子类) < public
 
public class Test {
    public static void main(String args[]) {
        Student s = new Student(3, "hello", "lirui");
        // 子类覆盖了父类的方法(重写)
        s.say();
        //s.study();
        // 自身的name
        System.out.print(s.name);
    }
	
	// 重写和重载的区别
	// 				重载 Overloading   									重写Overriding
	// 定义上： 方法名称相同，但参数类型或者个数不同 		方法名、参数类型和个数以及返回值都相同
	// 权限上： 对权限没有要求										被重写的方法不能拥有比父类更加严格的权限	
	// 范围	： 发生在一个类中										发生在继承中
}