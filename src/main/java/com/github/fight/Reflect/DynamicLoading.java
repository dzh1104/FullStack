package com.github.fight.Reflect;

/*

二、动态加载类
 1、编译时加载类是静态加载类，
     new 创建对象是静态加载类，在编译时刻就需要加载所有可用使用到的类，如果有一个用不了，那么整个文件都无法通过编译
 2、运行时加载类是动态加载类
   Class c =  Class.forName("类的全名")，不仅表示了类的类型，还表示了动态加载类，编译不会报错，在运行时才会加载，使用接口标准能更方便动态加载类的实现。功能性的类尽量使用动态加载，而不用静态加载。
   很多软件比如QQ,360的在线升级，并不需要重新编译文件，只是动态的加载新的东西
*/
public class DynamicLoading {

}
