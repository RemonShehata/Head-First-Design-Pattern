public class DecoyDuck extends Duck{

    @Override
    protected void display() {
        System.out.println("Displaying DecoyDuck...");
    }

    @Override
    protected void quack() {
        //do nothing
    }

    @Override
    protected void fly() {
        //do nothing
    }
}
