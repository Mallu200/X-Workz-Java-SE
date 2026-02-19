class NetflixProfile {
    // String is the default for labels and categories
    static String getMovieGenre() {
        // Logic: Returns the genre label
        return "Sci-Fi / Thriller";
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        String genre = getMovieGenre();
        System.out.println("Movie Category: " + genre);
        System.out.println("Main ended");
    }
}