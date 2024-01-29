package com.javaacademy.lessons.homework.homework3.ex1;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Comparator;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        Comparator<Feedback> comparator = (o1, o2) -> o2.getLikes() - o1.getLikes();
        comparator = comparator.thenComparing((o1, o2) -> o1.getTime().compareTo(o2.getTime()) * -1);
        TreeSet<Feedback> feedbacks = new TreeSet<>(comparator);
        addFeedback(feedbacks);
        System.out.println(feedbacks);
    }

    private static void addFeedback(TreeSet<Feedback> feedbacks) {
        Feedback feedback1 = new  Feedback(1, "отличный товар", 200,
                LocalDateTime.of(2024, Month.JANUARY, 25, 13, 37));
        Feedback feedback2 = new  Feedback(2, "так себе товар", 100,
                LocalDateTime.of(2024, Month.JANUARY, 25, 16, 37));
        Feedback feedback3 = new  Feedback(3, "плохой товар", 100,
                LocalDateTime.of(2024, Month.JANUARY, 25, 13, 37));
        feedbacks.add(feedback1);
        feedbacks.add(feedback2);
        feedbacks.add(feedback3);
    }
}
