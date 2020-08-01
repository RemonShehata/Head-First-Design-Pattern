public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        description = "Espresso";
        return super.getDescription();
    }

    @Override
    protected double cost() {
        return super.cost() + 40;
    }
}
