package indi.lirui;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        // 将回调对象传递给调用者(需要实现接口或者抽象方法)
        main.getData(new Callback() {
            @Override
            public void printMsg() {
                System.out.println("interface callback");
            }
        });
    }

    public String getData(Callback callback) {
        // 利用interface来实现回调
        callback.printMsg();
        return "hello, world...";
    }
}
