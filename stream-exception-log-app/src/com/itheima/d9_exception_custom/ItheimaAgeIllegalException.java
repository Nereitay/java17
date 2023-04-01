package com.itheima.d9_exception_custom;

import java.io.Serial;

/**
    自定义的编译时异常
      1、继承Exception
      2、重写构造器
 */
public class ItheimaAgeIllegalException extends Exception{
    @Serial
    private static final long serialVersionUID = 4199189133455934531L;

    public ItheimaAgeIllegalException() {
    }

    public ItheimaAgeIllegalException(String message) {
        super(message);
    }
}
