package com.javaacademy.lessons.homework.homework3.ex4;

import com.javaacademy.lessons.homework.homework3.ex4.items.Tree;
import com.javaacademy.lessons.homework.homework3.ex4.items.Uran;

public class Runner {
    public static void main(String[] args) {
        Burn<Uran> atomicReactor = uran -> System.out.println("зеленый свет вокруг!");
        Burn<Tree> bonfire = tree -> System.out.println("желто-красный свет вокруг!");
        Uran uran = new Uran();
        Tree tree = new Tree();
        atomicReactor.burn(uran);
        bonfire.burn(tree);
    }
}
