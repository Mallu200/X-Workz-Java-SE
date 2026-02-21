import java.time.LocalDate;
import java.time.Period;

class HRAnniversary {
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.of(2021, 2, 21);
        LocalDate today = LocalDate.now();

        // Period calculates the difference between two dates
        int years = Period.between(joiningDate, today).getYears();

        // Single line comment: Calculates the total years of service
        System.out.println("Total years of service: " + years);
    }
}