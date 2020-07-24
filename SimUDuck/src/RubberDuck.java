import fly.FlyNoWay;
import quack.QuackBehavior;
import quack.Squeak;

public class RubberDuck extends Duck implements QuackBehavior {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    protected void display() {
        System.out.println("Displaying RubberDuck...");
    }

    @Override
    public void quack() {
        System.out.println("Duck is squeaking...");
    }
}
