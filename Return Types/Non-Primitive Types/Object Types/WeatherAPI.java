class Climate {
    String city = "Bengaluru";
    float temp = 28.5f;
    int humidity = 60;
}

class WeatherAPI {
    // Returns a 'Climate' object
    static Climate getTodaysWeather() {
        return new Climate();
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        Climate report = getTodaysWeather();
        System.out.println("City: " + report.city + " | Temp: " + report.temp + "°C");
        System.out.println("Main ended");
    }
}