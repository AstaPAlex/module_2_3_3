package com.javaacademy.lessons.homework.homework3.ex3;

public class Runner {
    public static void main(String[] args) {
        Divination<String>  chamomile = name -> name.length() % 2 == 0 ? "Да" : "Нет";
        Divination<Human> grandmother = human -> human.getAge() + human.getHeight() > 210 ? "Да" : "Нет";
        System.out.println(chamomile.divination("Алексей"));
        Human human = new Human(31, 180);
        System.out.println(grandmother.divination(human));
    }
}
