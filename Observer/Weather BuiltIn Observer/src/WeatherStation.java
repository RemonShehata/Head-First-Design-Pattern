import java.util.Observable;

public class WeatherStation {
    public static void main(String[] args) {
        Observable o = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(o);
        ForecastDisplay forecastDisplay = new ForecastDisplay(o);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(o);

        WeatherData weatherData = (WeatherData) o;
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
