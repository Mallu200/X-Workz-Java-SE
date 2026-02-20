class OfficeDatabase {
    public static void main(String[] args) {
        byte smallId = 125;
        int databaseId = smallId; // Widening (Automatic)

        System.out.println("Local ID: " + smallId);
        System.out.println("Global DB ID: " + databaseId);
    }
}