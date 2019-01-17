package com.github.fight.ExceptionAndHandle;

public class FinallyAndReturn {

public static void main(String[] args) {
    
    int re = bar();
    System.out.println(re);
    /**
     * finally
     * 5
     *
     * 首先一个不容易理解的事实：在 try块中即便有return，break，continue等改变执行流的语句，finally也会执行。
     * */
    System.out.println("====================");
    
    int val = foo();
    System.out.println(val);
    /**
     * 1
     *
     * finally中的return 会覆盖 try 或者catch中的返回值
     * */
    
    System.out.println("====================");
    
    {
        int result;
        try {
            result = fn();
            System.out.println(result);           //输出100
        } catch (Exception e) {
            System.out.println(e.getMessage());    //没有捕获到异常
        }
        
        try {
            result = me();
            System.out.println(result);           //输出100
        } catch (Exception e) {
            System.out.println(e.getMessage());    //没有捕获到异常
        }
    }
    /**
     * 100
     * 100
     *
     * finally中的return会抑制（消灭）前面try或者catch块中的异常
     * */
    
    System.out.println("====================");
    
    {
        int result;
        try{
            result = qa();
        } catch (Exception e){
            System.out.println(e.getMessage());    //输出：我是finaly中的Exception
        }
        
        try{
            result  = vb();
        } catch (Exception e){
            System.out.println(e.getMessage());    //输出：我是finaly中的Exception
        }
    }
    /**
     * 我是finaly中的Exception
     * 我是finaly中的Exception
     *
     * finally中的异常会覆盖（消灭）前面try或者catch中的异常
     * */
    
    
    /**
     *
     * 上面的3个例子都异于常人的编码思维，因此我建议：
     *
     * 不要在fianlly中使用return。
     * 不要在finally中抛出异常。
     * 减轻finally的任务，不要在finally中做一些其它的事情，finally块仅仅用来释放资源是最合适的。
     * 将尽量将所有的return写在函数的最后面，而不是try … catch … finally中。
     *
     * */
}

private static int bar() {
    
    try {
        return 5;
    } finally {
        System.out.println("finally");
    }
}

private static int foo() {
    
    try {
        return 0;
    } finally {
        return 1;
    }
}

//catch中的异常被抑制
@SuppressWarnings("finally")
public static int fn() throws Exception {
    
    try {
        int a = 5 / 0;
        return 1;
    } catch (ArithmeticException amExp) {
        throw new Exception("我将被忽略，因为下面的finally中使用了return");
    } finally {
        return 100;
    }
}

//try中的异常被抑制
@SuppressWarnings("finally")
public static int me() throws Exception {
    
    try {
        int a = 5 / 0;
        return 1;
    } finally {
        return 100;
    }
}

//catch中的异常被抑制
@SuppressWarnings("finally")
public static int qa() throws Exception
{
    try {
        int a = 5/0;
        return 1;
    }catch(ArithmeticException amExp) {
        throw new Exception("我将被忽略，因为下面的finally中抛出了新的异常");
    }finally {
        throw new Exception("我是finaly中的Exception");
    }
}

//try中的异常被抑制
@SuppressWarnings("finally")
public static int vb() throws Exception
{
    try {
        int a = 5/0;
        return 1;
    }finally {
        throw new Exception("我是finaly中的Exception");
    }
    
}
    
}
