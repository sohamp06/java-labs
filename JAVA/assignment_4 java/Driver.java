/*
 * Name: Soham Patel
 * Program: Driver.java
 * Date: July 21 2023
 * Description: Details Of all Products
*/
import java.util.Date;
import java.util.Stack;
public class Driver {
    public static void main(String[] args) {
    	Stack<Product> productStack = new Stack<>();

        Product p1 = new Product(1, "Trolley Bag", 342.90, 3, 7, "Fragile! Please handle it carefully");
        Product p2 = new Product(2, "Attire", 599.99, 15, 8, "Please store this away from direct sunlight");
        Product p3 = new Product(3, "Coffee Mug", 49.99, 20, 10, "Breakable product");

        PerishableProduct pp1 = new PerishableProduct(4, "Condiments", 3.49, 10, 10,
                "Please store this in cool area", new Date(2023, 7, 27));
        PerishableProduct pp2 = new PerishableProduct(5, "Fruits", 5.99, 8, 4,
                "Please store this in cool area", new Date(2023, 7, 29));
        
        productStack.push(p1);
        productStack.push(p2);
        productStack.push(p3);
        productStack.push(pp1);
        productStack.push(pp2);
        
        for (Product product : productStack) {
            product.display();
            System.out.println();
        }
    }
}