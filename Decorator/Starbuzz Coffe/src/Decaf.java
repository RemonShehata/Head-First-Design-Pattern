public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        description = "Decaf";
        return super.getDescription();
    }

    @Override
    protected double cost() {
        return super.cost() + 30;
    }
}
