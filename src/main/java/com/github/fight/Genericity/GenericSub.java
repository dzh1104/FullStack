package com.github.fight.Genericity;

public class GenericSub extends Apple<String> {

    @Override
    public String getInfo() {

        return "子类: " + super.getInfo();
    }

    @Override
    public void setInfo(String info) {

        super.setInfo(info);
    }

    /*
    // 下面重写方法时错误的，重写父类方法时返回值类型不一致
    public Object setInfo(String info) {

        return "子类";
    }
    */

}
