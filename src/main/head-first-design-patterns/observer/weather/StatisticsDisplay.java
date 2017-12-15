package observer.weather;

public class StatisticsDisplay implements Observer,DisplyElement {
    private float maxTemp = 0.0f;
    private float minTemp = 20000;
    private float tempSum = 0.0f;
    private int numReadings = 0;
    WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    public void update(float temp, float humidity, float pressure) {
        numReadings++;
        tempSum += temp;
        if(temp>maxTemp)
            maxTemp = temp;
        if(temp<minTemp)
            minTemp = temp;

        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
