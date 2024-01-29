package com.javaacademy.lessons.homework.homework3.ex2;

import com.javaacademy.lessons.homework.homework3.ex2.fruits.Apple;
import com.javaacademy.lessons.homework.homework3.ex2.fruits.Apricot;

public class Runner {
    public static void main(String[] args) {
        Orchard<Apple> appleOrchard = Apple::new;
        Orchard<Apricot> apricotOrchard = Apricot::new;

        System.out.println(appleOrchard.grow());
        System.out.println(apricotOrchard.grow());
    }
}
