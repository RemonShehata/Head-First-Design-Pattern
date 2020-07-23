public class RubberDuck extends Duck {
    @Override
    protected void display() {
        System.out.println("Displaying RubberDuck...");
    }

    @Override
    protected void quack() {
        System.out.println("Duck is squeaking...");
    }
}
