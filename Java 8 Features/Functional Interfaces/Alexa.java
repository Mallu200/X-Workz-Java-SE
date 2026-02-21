@FunctionalInterface
interface VoiceCommand {
    void execute(); // Single abstract method to trigger an action
}

class Alexa {
    public static void main(String[] args) {
        // Lambda defining what happens when "Turn on Lights" is heard
        VoiceCommand lightsOn = () -> System.out.println("SmartHome: All lights set to 100% brightness.");

        lightsOn.execute(); // Running the command logic
    }
}