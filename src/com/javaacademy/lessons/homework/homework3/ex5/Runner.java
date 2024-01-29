package com.javaacademy.lessons.homework.homework3.ex5;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = Boat::getHeight;
        Ruler<Animal> animalRuler = animal -> animal.getHeightTail() + animal.getGetHeightBody();
        Boat boat = new Boat(156);
        Animal animal = new Animal(145, 23);
        System.out.println(boatRuler.measure(boat));
        System.out.println(animalRuler.measure(animal));
    }
}
