package com.javaacademy.lessons.homework.homework3.ex1;

import java.time.LocalDateTime;

public class Feedback {
    private final int id;
    private final String text;
    private final int likes;
    private final LocalDateTime time;

    public Feedback(int id, String text, int likes, LocalDateTime time) {
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.time = time;
    }

    public int getLikes() {
        return likes;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Feedback{"
                + "id=" + id
                + ", text='" + text
                + '\'' + ", likes=" + likes
                + ", time=" + time + '}';
    }

}
