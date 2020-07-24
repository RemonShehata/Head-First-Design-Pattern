import fly.FlyNoWay;
import quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    protected void display() {
        System.out.println("Displaying DecoyDuck...");
    }

}
