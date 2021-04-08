public class Main {

    public static void main(String[] args) {

        // 声明一个整型数组
        int[] age = {22, 23, 24};
        int[] intAge = new int[3];
        String[] strArr = new String[3];

        // for (int i = 0; i < age.length; i++) {
        //     System.out.println(age[i]);
        // }

        // 初始化数组
        char[] ch = {'a', 'b', 'c'};
        System.out.println(ch.length);

        // foreach
        for (char item: ch) {
            System.out.println(item);
        }

        // 冒泡排序
        int[] arr = {3, 9, 2, 7, 8};

        // 外层循环控制比较次数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环比较大小
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int e: arr) {
            System.out.println(e);
        }

    }
}
