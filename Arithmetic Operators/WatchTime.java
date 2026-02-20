class WatchTime {
    public static void main(String[] args) {
        int totalMinutes = 135;

        int hours = totalMinutes / 60;
        int mins = totalMinutes % 60;

        System.out.println("Video Duration: " + hours + "hr " + mins + "mins"); // 2hr 15mins
    }
}