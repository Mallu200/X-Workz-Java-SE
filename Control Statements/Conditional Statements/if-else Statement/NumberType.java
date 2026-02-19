class NumberType {
    public static void main(String args[]) {
        System.out.println("Main started");

        int num = 15;

        // IF-ELSE with Modulo:
        // 'num % 2' calculates the remainder when num is divided by 2.
        // If remainder is 0, it's even. Otherwise, it's odd.
        if (num % 2 == 0) {
            // This runs if the condition is True (e.g., num = 10, 20, 30)
            System.out.println(num + " is an Even Number.");
        } else {
            // This runs if the condition is False (e.g., num = 15, 21, 33)
            System.out.println(num + " is an Odd Number.");
        }

        System.out.println("Main ended");
    }
}