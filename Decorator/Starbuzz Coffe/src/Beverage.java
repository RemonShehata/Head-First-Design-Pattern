public class Beverage {
    protected String description;

    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;

    public String getDescription() {
        return description;
    }

    protected double cost() {
        double cost = 0;
        if (hasMilk()) {
            cost += 10;
        }
        if (hasSoy()) {
            cost += 20;
        }
        if (hasMocha()) {
            cost += 30;
        }
        if (hasWhip()) {
            cost += 40;
        }

        return cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
