package com.liumou.homework2;

public class MyException extends Exception{
    //自定义异常类，继承父类，使用父类方法
    public MyException(String message){
        super(message);
    }
}
