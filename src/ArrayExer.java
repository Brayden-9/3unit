/*
创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
 */

public class ArrayExer {
    public static void main(String[] args) {

        int[] arr = new int[6];//动态初始化数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) + 1;//随机生成1~30的数，并赋值；由于random方法返回的是一个double类型数据，所以要进行强制类型转换

            boolean flag = false;
            while (true) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {//如果重复就重新赋值
                    arr[i] = (int) (Math.random() * 30) + 1;
                    flag = false;
                    continue;
                }
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" " );
        }
    }
}