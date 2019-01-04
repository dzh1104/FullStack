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
    public Object getInfo(String info) {

        return "子类";
    }
    */

}

class GenericSub2 extends Apple {

@Override
//  重写父类的方法
public String getInfo() {
    
    //  super.getInfo()方法返回值是Object类型
    //  所以加toString()才返回String类型
    return super.getInfo().toString();
}

}
