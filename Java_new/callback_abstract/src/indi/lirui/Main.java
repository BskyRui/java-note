package indi.lirui;

public class Main {

    public static void main(String[] args) {
        Callback callback = new Callback() {
            @Override
            void printMsg(String msg) {
                System.out.println(msg);
            }
        };
        callback.printMsg("hello, world.");
        System.out.println(callback.getData());
    }
}
