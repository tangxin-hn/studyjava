package combining.ducks;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable creatRubberDuck() {
        return new QuackCount(new RubberDuck());
    }

    @Override
    public Quackable creatReaheadDuck() {
        return new QuackCount(new RedheadDuck());
    }

    @Override
    public Quackable creatMallardDuck() {
        return new QuackCount(new MallarDuck());
    }

    @Override
    public Quackable creatDuckCall() {
        return new QuackCount(new DuckCall());
    }
}
