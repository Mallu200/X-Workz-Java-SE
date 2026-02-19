class GymSchedule {
    public static void main(String args[]) {
        System.out.println("Main started");

        String day = "Wednesday";

        // SWITCH: Calendar-Based Logic
        switch (day) {
            case "Monday":
                System.out.println("Today's Target: Chest & Triceps");
                break;
            case "Wednesday":
                // Since 'day' is Wednesday, the code jumps straight here!
                System.out.println("Today's Target: Back & Biceps");
                break;
            case "Friday":
                System.out.println("Today's Target: Legs & Cardio");
                break;
            default:
                // This covers Tuesday, Thursday, Saturday, and Sunday
                System.out.println("Rest Day or Light Stretching.");
        }

        System.out.println("Main ended");
    }
}