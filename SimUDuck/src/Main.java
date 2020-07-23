import fly.FlyNoWay;
import fly.FlyWithWings;
import quack.MuteQuack;
import quack.Quack;
import quack.Squeak;

public class Main {

    private static Duck duck;

    public static void main(String[] args) {
        Main m = new Main();

        duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        m.callDuckMethods();

        duck = new RedheadDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        m.callDuckMethods();

        duck = new RubberDuck();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Squeak());
        m.callDuckMethods();

        duck = new DecoyDuck();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        m.callDuckMethods();
    }

    private void callDuckMethods() {
        duck.display();
        duck.getFlyBehavior().fly();
        duck.swim();
        duck.getQuackBehavior().quack();
        System.out.println("**************");
    }
}
