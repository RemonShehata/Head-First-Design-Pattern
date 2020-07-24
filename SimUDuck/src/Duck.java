import fly.FlyBehavior;
import quack.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    protected void swim() {
        System.out.println("Duck is swimming...");
    }

    protected abstract void display();

    protected void performFly() {
        flyBehavior.fly();
    }

    protected void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
