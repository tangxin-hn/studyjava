package combining.ducks;

public class GooseAdapter implements Quackable {
    Observable observable;
    Goose goose;

    public GooseAdapter (Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.hook();
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
}
