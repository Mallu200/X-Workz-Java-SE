package com.xworkz.streaming.dto;

import java.util.Objects;

public class MovieDTO {
    // 1. Private Properties
    private String title;
    private String director;
    private int releaseYear;
    private double rating;
    private boolean is4KSupported;

    // 2. No-Argument Constructor
    public MovieDTO() {
        System.out.println("Invoking No-arg constructor in MovieDTO");
    }

    // 3. All-Argument Constructor
    public MovieDTO(String title, String director, int releaseYear, double rating, boolean is4KSupported) {
        System.out.println("Invoking All-arg constructor in MovieDTO");
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.is4KSupported = is4KSupported;
    }

    // 4. Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public double getRating() { return rating; }
    public void setRating(double rating) {
        // Simple validation: Rating must be between 0 and 10
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Invalid Rating! Defaulting to 0.0");
        }
    }

    public boolean isIs4KSupported() { return is4KSupported; }
    public void setIs4KSupported(boolean is4KSupported) { this.is4KSupported = is4KSupported; }

    // 5. Overriding toString()
    @Override
    public String toString() {
        return "MovieDTO [Title=" + title + ", Director=" + director +
                ", Year=" + releaseYear + ", Rating=" + rating +
                ", 4K=" + is4KSupported + "]";
    }

    // 6. Overriding hashCode and equals (based on Title and Director)
    @Override
    public int hashCode() {
        return Objects.hash(title, director);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MovieDTO other = (MovieDTO) obj;
        return Objects.equals(title, other.title) &&
                Objects.equals(director, other.director);
    }
}