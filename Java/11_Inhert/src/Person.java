import javax.print.DocFlavor;

/**
 * Created by 李锐 on 2015/8/23.
 */
public class Person {
    int age;
    String sex;
    // 构造函数
    Person(int age, String sex){
        this.age = age;
        this.sex = sex;
    }

	// 函数重载
    Person() {}

    public void say() {
        System.out.println("say: hello, person");
    }
}
