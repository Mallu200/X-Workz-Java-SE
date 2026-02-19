package com.xworkz.streaming;

import com.xworkz.streaming.dto.MovieDTO;

public class StreamingRunner {
    public static void main(String[] args) {
        System.out.println("Main method started in StreamingRunner");

        // Using All-args constructor
        MovieDTO movie1 = new MovieDTO("Inception", "Christopher Nolan", 2010, 8.8, true);

        // Using No-args constructor + Setters
        MovieDTO movie2 = new MovieDTO();
        movie2.setTitle("The Dark Knight");
        movie2.setDirector("Christopher Nolan");
        movie2.setReleaseYear(2008);
        movie2.setRating(9.0);
        movie2.setIs4KSupported(true);

        // Printing Movie details
        System.out.println("\n--- Movie Library ---");
        System.out.println(movie1);
        System.out.println(movie2);

        // Testing logical equality
        MovieDTO movie3 = new MovieDTO("Inception", "Christopher Nolan", 2024, 0.0, false);
        System.out.println("\nIs movie1 logically the same as movie3? " + movie1.equals(movie3));

        System.out.println("Main method ended successfully");
    }
}