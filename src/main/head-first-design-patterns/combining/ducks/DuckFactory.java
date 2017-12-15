package combining.ducks;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable creatDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable creatMallardDuck() {
        return new MallarDuck();
    }

    @Override
    public Quackable creatReaheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable creatRubberDuck() {
        return new RubberDuck();
    }
}
