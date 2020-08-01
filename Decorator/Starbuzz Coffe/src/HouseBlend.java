public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        description = "HouseBlend";
        return super.getDescription();
    }

    @Override
    protected double cost() {
        return super.cost() + 10;
    }
}
