class SpaceApp {
    public static void main(String[] args) {
        double exactDistance = 400500.678945;
        float appDisplay = (float) exactDistance; // Manual Narrowing

        System.out.println("Exact Scientific Data: " + exactDistance);
        System.out.println("App Display Data: " + appDisplay);
    }
}