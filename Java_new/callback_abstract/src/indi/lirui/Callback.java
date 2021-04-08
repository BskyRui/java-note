package indi.lirui;

/**
 * Created by LargeRui on 8/8/16.
 */


public abstract class Callback {

    String data = "hello, world";
    abstract void printMsg(String msg);

    public String getData() {
        return data;
    }
}
