class Settings {
    public static void main(String[] args) {
        String darkModeSetting = "true";
        
        // Converts "true" to a real boolean true
        boolean isDark = Boolean.parseBoolean(darkModeSetting);
        
        if (isDark) {
            System.out.println("Applying Dark Theme...");
        }
    }
}