package com.jvm;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<byte[]>();

        int i = 9;

        boolean flag = true;
        while (flag) {
            try {
                i++;
                list.add(new byte[1024 * 1024]);//添加1m大小的数组对象
                Thread.sleep(40);
            } catch (Throwable e) {
                e.printStackTrace();
                flag = false;
                System.out.println("count = " + i);//运行次数
            }
        }
    }
}
