/*
 * Name: Soham Patel
 * Program: Product.java
 * Date: July 21 2023
 * Description: Details Of all Products
*/
import java.util.Date;
import java.util.Stack;
public class Product {
	
	public static void main(String[] args) {
		
	}
    private int id;
    private String nameOfProduct;
    private double costingPerUnit;
    private int inStockItems;
    private int itemsToOrder;
    private String instructionForItems;

    public Product() {}

	 public Product(int id, String nameOfProduct, double costingPerUnit, int inStockItems, int itemsToOrder, String instructionForItems) {
	 this.id = id;
	 this.nameOfProduct = nameOfProduct;
	 this.costingPerUnit = costingPerUnit;
	 this.inStockItems = inStockItems;
	 this.itemsToOrder = itemsToOrder;
	 this.instructionForItems = instructionForItems;
	}

	    public void setid(int id) {
	        this.id = id;
	    }

	    public void setnameOfProduct(String nameOfProduct) {
	        this.nameOfProduct = nameOfProduct;
	    }

	    public void setcostingPerUnit(double costingPerUnit) {
	        this.costingPerUnit = costingPerUnit;
	    }

	    public void setinStockItems(int inStockItems) {
	        this.inStockItems = inStockItems;
	    }

	    public void setitemsToOrder(int itemsToOrder) {
	        this.itemsToOrder = itemsToOrder;
	    }

	    public void setinstructionForItems(String instructionForItems) {
	        this.instructionForItems = instructionForItems;
	    }
	    
	    public int getid() {
	        return id;
	    }

	    public String getnameOfProduct() {
	        return nameOfProduct;
	    }

	    public double getcostingPerUnit() {
	        return costingPerUnit;
	    }

	    public int getinStockItems() {
	        return inStockItems;
	    }

	    public int getitemsToOrder() {
	        return itemsToOrder;
	    }

	    public String getinstructionForItems() {
	        return instructionForItems;
	    }

    public void display() {
    	System.out.println("SKU/ID: " + id);
        System.out.println("Product Name: " + nameOfProduct);
        System.out.println("Unit Cost: " + costingPerUnit);
        System.out.println("Quantity on hand: " + inStockItems);
        System.out.println("Quantity Needed: " + itemsToOrder);
        System.out.println("Special Instructions: " + instructionForItems);
    }       
}