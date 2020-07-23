public class RubberDuck extends Duck implements Quackable {
    @Override
    protected void display() {
        System.out.println("Displaying RubberDuck...");
    }

    @Override
    public void quack() {
        System.out.println("Duck is squeaking...");
    }
}
