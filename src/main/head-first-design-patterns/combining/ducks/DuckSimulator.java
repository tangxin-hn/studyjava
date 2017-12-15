package combining.ducks;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.creatMallardDuck();
        Quackable reaheadDuck = duckFactory.creatReaheadDuck();
        Quackable duckCall = duckFactory.creatDuckCall();
        Quackable rubberDuck = duckFactory.creatRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(reaheadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallard1 = duckFactory.creatMallardDuck();
        Quackable mallard2 = duckFactory.creatMallardDuck();
        Quackable mallard3 = duckFactory.creatMallardDuck();
        Quackable mallard4 = duckFactory.creatMallardDuck();

        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulate: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCount.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
