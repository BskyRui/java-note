package com.lirui.oop;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // 1) Map中的数据都是以键值对(key-value)的形式存储的
    // 2) key-value以Entry类型的对象实例存在
    // 3) 可以通过key值快速的查找value
    // 4) key的值必须唯一

    // HashMap
    // 1) 基于哈希表的Map接口的实现
    // 2) 允许使用null值和键
    // 3) key值不允许重复
    // 4) HashMap中的Entry对象是无序排列的

    public static void main(String[] args) {
	    Map<String, String> map = new HashMap<>();
        map.put("name", "lirui");
        map.put("age", "22");

        System.out.println(map);
        System.out.println("size: " + map.size());

        // 遍历
        map.forEach( (k, v) -> {
            System.out.println(k + ':' + v);
        });

        // 获取所有key map.keySet()
        for (String k: map.values()) {
            System.out.println(k);
        }

        // 获取某个key
        System.out.println("name: " + map.get("name"));
    }
}

/*
HashTable和HashMap区别

        1) 继承不同。
        public class HashTable extends Dictionary implements Map
        public class HashMap  extends AbstractMap implements Map

        2) HashTable 中的方法是同步的，而HashMap中的方法在缺省情况下是非同步的。在多线程并发的环境下，可以直接使用HashTable，但是要使用HashMap的话就要自己增加同步处理了。

        3) HashTable，key和value都不允许出现null值。
        在HashMap中，null可以作为键，这样的键只有一个；可以有一个或多个键所对应的值为null。当get()方法返回null值时，即可以表示 HashMap中没有该键，也可以表示该键所对应的值为null。因此，在HashMap中不能由get()方法来判断HashMap中是否存在某个键， 而应该用containsKey()方法来判断。

        4) 两个遍历方式的内部实现上不同。
            HashTable、HashMap都使用了 Iterator。而由于历史原因，HashTable还使用了Enumeration的方式 。

        5) 哈希值的使用不同，HashTable直接使用对象的hashCode。而HashMap重新计算hash值。

        6) HashTable和HashMap它们两个内部实现方式的数组的初始大小和扩容的方式。HashTable中hash数组默认大小是11，增加的方式是 old*2+1。HashMap中hash数组的默认大小是16，而且一定是2的指数。
*/
