package com.lirui.oop;

import java.io.Serializable;

/**
 * Created by LargeRui on 4/26/17.
 */
public class Goods implements Serializable {
    private String name;
    private float price;
    private int id;

    public Goods(String name, float price, int id) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "编号: " + id + ", 价格: " + price + ", 名称: " + name;
    }
}
