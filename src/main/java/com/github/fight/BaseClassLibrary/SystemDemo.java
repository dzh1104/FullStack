package com.github.fight.BaseClassLibrary;

import java.util.Map;

public class SystemDemo {

    public static void main(String[] args) {
        // 获取系统所有的环境变量
        Map<String, String> evn = System.getenv();
        for(String name : evn.keySet()) {
            System.out.println(name + "--->" + evn.get(name));
        }

        // 以毫秒为单位的当前时间
        System.out.println(System.currentTimeMillis());

        new TestGc();
        new TestGc();

        System.gc(); // 运行垃圾回收器,相当于呼喊保洁阿姨

        // System.exit(0);	//非0状态是异常终止,退出jvm
        System.out.println("hello");//虚拟机已经退出，无法执行

        int[] src = {11,22,33,44,55};
        int[] dest = new int[8];

        for (int i : src) {
            System.out.println(i);
        }

        //将数组内容拷贝
        System.arraycopy(src, 0, dest, 0, src.length);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }
}

class TestGc {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("垃圾被清扫了");
    }
}
