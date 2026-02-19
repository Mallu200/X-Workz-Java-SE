class Movie {
    String mName;

    // --- STEP 1: CONSTRUCTOR ---
    // Movies are independent productions created in the studio.
    Movie(String name) {
        this.mName = name;
        // Mandatory SOP to trace the creation of the shared Movie object
        System.out.println(">> [STUDIO-PRODUCTION] Movie Script Finalized: " + name);
    }
}

class Actor {
    String aName;
    
    // --- STEP 2: THE MANY-TO-MANY LINK ---
    // An Actor 'has-a' reference to an array of Movies.
    // Multiple Actor objects can reference the exact same Movie objects in the heap.
    Movie[] filmography;

    // Constructor: Linking the Actor to their list of Movies (Object Injection)
    Actor(String name, Movie[] movies) {
        this.aName = name;
        
        // This establishes the association by storing the array of movie references
        this.filmography = movies;
        System.out.println(">> [CASTING-AGENCY] Actor '" + name + "' signed for " + movies.length + " projects.");
    }

    void printFilmography() {
        System.out.println("\n--- [IMDb TALENT PROFILE: " + aName.toUpperCase() + "] ---");
        
        // Safety Check: Verify if the actor has any movies associated in their record
        if (filmography != null && filmography.length > 0) {
            // TRAVERSING THE ASSOCIATION:
            // We iterate through the filmography array to access each shared Movie object
            for (Movie m : filmography) {
                System.out.println("  > Starring in: " + m.mName);
            }
        } else {
            System.out.println("  > Status: No active projects in filmography.");
        }
        System.out.println("----------------------------------------------\n");
    }
}

class ManyToManyCinema {
    public static void main(String[] args) {
        System.out.println(">> [LOG] Initializing Cinema Database...");

        // 1. Create the 'Many' (Movies) as independent shared objects
        Movie m1 = new Movie("Inception");
        Movie m2 = new Movie("Interstellar");

        // 2. Define the "Many" set for a specific actor
        // This array stores the addresses of m1 and m2
        Movie[] leoMovies = {m1, m2};

        // 3. Create the 'Actor' and inject the 'Many' (Movies)
        Actor a = new Actor("Leonardo", leoMovies);

        // 4. Utilize the association to display the actor's movie list
        a.printFilmography();

        System.out.println(">> [LOG] Cinema Database Update Complete.");
    }
}