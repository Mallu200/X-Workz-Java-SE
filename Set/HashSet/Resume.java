import java.util.HashSet;

class Resume {
    public static void main(String[] args) {
        HashSet<String> candidateSkills = new HashSet<>();
        candidateSkills.add("Java");
        candidateSkills.add("Python");
        candidateSkills.add("SQL");

        if (candidateSkills.contains("Java")) {
            System.out.println("Candidate is a match for the Java role!");
        }
    }
}