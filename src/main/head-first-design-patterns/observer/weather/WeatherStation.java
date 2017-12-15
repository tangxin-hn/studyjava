package observer.weather;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData2 weatherData = new WeatherData2();

        CurrentConditionsDisplay2 conditionsDisplay = new CurrentConditionsDisplay2(weatherData);
        //StatisticsDisplay statisticDisplay = new StatisticsDisplay(weatherData);
        //ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        //HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
