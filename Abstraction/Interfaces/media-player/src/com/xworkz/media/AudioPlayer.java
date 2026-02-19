package com.xworkz.media;

public class AudioPlayer implements Playable {
    private String songName;

    public AudioPlayer(String songName) {
        this.songName = songName;
    }

    @Override
    public void play() {
        System.out.println("Invoking play in AudioPlayer");
        System.out.println(">> [AUDIO] Playing '" + songName + "' through Stereo Output.");
    }

    @Override
    public void pause() {
        System.out.println(">> [AUDIO] Audio playback suspended.");
    }

    @Override
    public void stop() {
        System.out.println(">> [AUDIO] Closing audio stream.");
    }
}