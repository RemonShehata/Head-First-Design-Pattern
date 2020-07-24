import fly.FlyNoWay;
import quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override

    protected void display() {
        System.out.println("Displaying model duck...");
    }
}
