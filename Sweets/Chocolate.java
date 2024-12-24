package Sweets;

public class Chocolate extends Sweet {
    private double cocoaContent; // percentage of cocoa

    public Chocolate(String name, double weight, double sugarContent, double cocoaContent) {
        super(name, weight, sugarContent);
        this.cocoaContent = cocoaContent;
    }

    public double getCocoaContent() {
        return cocoaContent;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Cocoa Content: %.2f%%", cocoaContent);
    }
}