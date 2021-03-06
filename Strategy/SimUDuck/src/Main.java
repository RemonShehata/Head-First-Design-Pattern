import fly.FlyRocketPowered;

public class Main {

    private static Duck duck;

    public static void main(String[] args) {
        Main m = new Main();

        duck = new MallardDuck();
        m.callDuckMethods();

        duck = new RedheadDuck();
        m.callDuckMethods();

        duck = new RubberDuck();
        m.callDuckMethods();

        duck = new DecoyDuck();
        m.callDuckMethods();

        duck = new ModelDuck();
        m.callDuckMethods();
        duck.setFlyBehavior(new FlyRocketPowered());
        m.callDuckMethods();
    }

    private void callDuckMethods() {
        duck.display();
        duck.performQuack();
        duck.swim();
        duck.performFly();
        System.out.println("**************");
    }
}
