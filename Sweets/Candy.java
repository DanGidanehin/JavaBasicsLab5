package Sweets;

public class Candy extends Sweet {
    private String flavor;

    public Candy(String name, double weight, double sugarContent, String flavor) {
        super(name, weight, sugarContent);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Flavor: %s", flavor);
    }
}