package observer.weather;
import java.util.Observable;
import java.util.Observer;

public class WeatherData2  extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2() {}

    public void measurementsChanged() {
        setChanged();;
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return  this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }
}
