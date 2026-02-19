package com.xworkz.media;

public class MediaRunner {
    public static void main(String[] args) {
        System.out.println("Main method started...");

        // Polymorphic Array: One array to hold different media types!
        Playable[] playlist = {
                new AudioPlayer("Believer - Imagine Dragons"),
                new VideoPlayer("Interstellar")
        };

        for (Playable item : playlist) {
            item.play();
            item.pause();
            item.stop();
            System.out.println("---------------------------");
        }

        System.out.println("Main method ended.");
    }
}