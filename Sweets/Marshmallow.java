package Sweets;

public class Marshmallow extends Sweet {
    private boolean isGlazed;

    public Marshmallow(String name, double weight, double sugarContent, boolean isGlazed) {
        super(name, weight, sugarContent);
        this.isGlazed = isGlazed;
    }

    public boolean isGlazed() {
        return isGlazed;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Glazed: %s", isGlazed ? "Yes" : "No");
    }
}