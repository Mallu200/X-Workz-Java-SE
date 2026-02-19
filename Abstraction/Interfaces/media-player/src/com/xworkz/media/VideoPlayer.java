package com.xworkz.media;

public class VideoPlayer implements Playable {
    private String movieTitle;

    public VideoPlayer(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Override
    public void play() {
        System.out.println("Invoking play in VideoPlayer");
        System.out.println(">> [VIDEO] Decoding 4K frames for: " + movieTitle);
    }

    @Override
    public void pause() {
        System.out.println(">> [VIDEO] Video frame frozen.");
    }

    @Override
    public void stop() {
        System.out.println(">> [VIDEO] Releasing Graphics Hardware resources.");
    }
}