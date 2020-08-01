public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        description = "Dark Roast";
        return super.getDescription();
    }

    @Override
    protected double cost() {
        return super.cost() + 20;
    }
}
