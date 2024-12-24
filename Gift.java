// Gift class
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Sweets.Chocolate;
import Sweets.Sweet;

class Gift {
    private List<Sweet> sweets;

    public Gift() {
        this.sweets = new ArrayList<>();
    }

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public double calculateTotalWeight() {
        return sweets.stream().mapToDouble(Sweet::getWeight).sum();
    }

    public void sortBySugarContent() {
        sweets.sort(Comparator.comparingDouble(Sweet::getSugarContent));
    }

    public List<Sweet> findSweetsByCocoaContent(double minCocoa, double maxCocoa) {
        List<Sweet> result = new ArrayList<>();
        for (Sweet sweet : sweets) {
            if (sweet instanceof Chocolate) {
                double cocoaContent = ((Chocolate) sweet).getCocoaContent();
                if (cocoaContent >= minCocoa && cocoaContent <= maxCocoa) {
                    result.add(sweet);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Gift Contents:\n");
        for (Sweet sweet : sweets) {
            builder.append(sweet).append("\n");
        }
        return builder.toString();
    }
}