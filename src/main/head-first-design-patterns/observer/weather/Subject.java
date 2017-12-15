package observer.weather;

public interface Subject {
    public void registerObserver(Observer o);
    public void removObserver(Observer o);
    public void notifyObservers();
}
