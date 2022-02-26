package com.OOAD;

public interface ConsoleLogger {
    default void out(String msg) {
        System.out.println(msg);
    }
}
