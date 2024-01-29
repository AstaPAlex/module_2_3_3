package com.javaacademy.lessons.homework.homework3.ex2;

import com.javaacademy.lessons.homework.homework3.ex2.fruits.Fruit;

@FunctionalInterface
public interface Orchard<T extends Fruit> {
    T grow();
}
