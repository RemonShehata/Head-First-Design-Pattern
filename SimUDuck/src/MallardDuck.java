import fly.FlyBehavior;
import quack.QuackBehavior;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior {
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
