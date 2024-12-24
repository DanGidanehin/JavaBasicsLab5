package Sweets;

// Abstract base class for sweets
public abstract class Sweet {
    private String name;
    private double weight; // in grams
    private double sugarContent; // in grams

    public Sweet(String name, double weight, double sugarContent) {
        this.name = name;
        this.weight = weight;
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    @Override
    public String toString() {
        return String.format("%s (Weight: %.2f g, Sugar Content: %.2f g)", name, weight, sugarContent);
    }
}