package com.javaacademy.lessons.homework.homework3.ex5;

@FunctionalInterface
public interface Ruler<T> {
    Integer measure(T t);
}
