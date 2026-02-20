class SmartLight {
    public static void main(String[] args) {
        int brightnessSetting = 100;
        byte hardwareValue = (byte) brightnessSetting; // Manual Narrowing

        System.out.println("User Setting: " + brightnessSetting);
        System.out.println("Hardware Signal: " + hardwareValue);
    }
}