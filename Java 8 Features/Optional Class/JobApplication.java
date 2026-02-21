import java.util.Optional;

class JobApplication {
    public static void main(String[] args) {
        Optional<String> portfolio = Optional.of("www.mywork.com");

        // Filters and prints only if it's a secure 'https' link
        portfolio.filter(link -> link.startsWith("https"))
                 .ifPresent(link -> System.out.println("Secure Link: " + link));
                 
        System.out.println("Link checked.");
    }
}