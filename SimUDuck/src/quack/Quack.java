package quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is quacking...");
    }
}
