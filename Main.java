// Main class
import java.util.*;

import Sweets.Candy;
import Sweets.Chocolate;
import Sweets.Marshmallow;
import Sweets.Sweet;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Gift gift = new Gift();

    // Add sweets to the gift
    gift.addSweet(new Chocolate("Milk Chocolate", 150, 50, 40));
    gift.addSweet(new Chocolate("Dark Chocolate", 100, 20, 85));
    gift.addSweet(new Candy("Fruit Candy", 50, 30, "Strawberry"));
    gift.addSweet(new Marshmallow("Vanilla Marshmallow", 200, 100, true));

    // Print gift contents
    System.out.println(gift);

    // Calculate total weight
    System.out.printf("Total Weight: %.2f g%n", gift.calculateTotalWeight());

    // Sort sweets by sugar content
    gift.sortBySugarContent();
    System.out.println("\nSorted by Sugar Content:");
    System.out.println(gift);

    // Input minCocoa and maxCocoa values
    System.out.println("\nEnter the minimum cocoa content percentage:");
    double minCocoa = scanner.nextDouble();

    System.out.println("Enter the maximum cocoa content percentage:");
    double maxCocoa = scanner.nextDouble();

    // Find chocolates by cocoa content
    List<Sweet> chocolatesInRange = gift.findSweetsByCocoaContent(minCocoa, maxCocoa);

    if (chocolatesInRange.isEmpty()) {
      System.out.printf("\nNo sweets found with Cocoa Content between %.2f%% and %.2f%%.%n", minCocoa, maxCocoa);
    } else {
      System.out.printf("\nSweets with Cocoa Content between %.2f%% and %.2f%%:%n", minCocoa, maxCocoa);
      for (Sweet chocolate : chocolatesInRange) {
        System.out.println(chocolate);
      }
    }

    scanner.close();
  }
}