package ducks;

public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
}
