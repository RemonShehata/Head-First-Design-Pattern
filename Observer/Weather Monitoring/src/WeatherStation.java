public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(50, 60, 70);
        System.out.println("*********");
        weatherData.setMeasurements(5, 6, 7);
        System.out.println("*********");
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(500, 600, 700);

    }
}
