import fly.FlyBehavior;
import fly.FlyWithWings;
import quack.Quack;
import quack.QuackBehavior;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    protected void display() {
        System.out.println("Displaying MallardDuck...");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Duck is quacking...");
    }
}
