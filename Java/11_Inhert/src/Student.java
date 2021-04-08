/**
 * Created by 李锐 on 2015/8/23.
 */

public class Student extends Person {
    String name;

    Student() {
        this.say();
    }

    Student (int age, String sex, String name) {
        //this(); 调用本类的构造函数
        super(age, sex);
        // 调用父类构造函数
        this.name = name;
        // super代表父类 super()代表父类的构造函数
        super.say();
    }


    public void study() {
        System.out.println("study");
    }

    public void say() {
        System.out.println("say: hello, i'm Student.");
    }

}
