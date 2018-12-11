package com.github.fight.BaseClassLibrary;

import java.util.Map;

public class SystemDemo {

    public static void main(String[] args) {
        Map<String, String> evn = System.getenv();
        for(String name : evn.keySet()) {
            System.out.println(name + "--->" + evn.get(name));
        }
    }
}
