package com.itheima.d9_exception_custom;

import java.io.Serial;

/**
    自定义的运行时异常
      1、继承RuntimeException
      2、重写构造器
 */
public class ItheimaAgeIllegalRuntimeException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 6445017830641989236L;

    public ItheimaAgeIllegalRuntimeException() {
    }

    public ItheimaAgeIllegalRuntimeException(String message) {
        super(message);
    }
}
