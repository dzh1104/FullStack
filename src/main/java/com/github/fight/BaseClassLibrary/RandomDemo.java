package com.github.fight.BaseClassLibrary;

import java.util.Random;
import java.util.UUID;

// Random类
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int resInt = random.nextInt();
        System.out.println(resInt);
        System.out.println(random.nextDouble());

        // 相同的种子，生成的随机数是一样的
        Random random1 = new Random(10);
        System.out.println(random1.nextDouble());

        // 生成34到179之间的随机数
        // 34 + 145 = 179
        // nextInt(145) 生成0到145之间的随机数
        System.out.println(34 + new Random().nextInt(145));

        // UUID: 通用唯一识别符
        // 在一台机器上生成的数字，结合当前的时间 + 当前电脑设备的网卡，生成一段字符串
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());


    }
}
