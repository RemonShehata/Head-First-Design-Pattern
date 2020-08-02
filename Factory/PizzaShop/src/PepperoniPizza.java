public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking greek pizza");
    }

    @Override
    public void cut() {
        System.out.println("cutting greek pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing greek pizza");
    }
}
