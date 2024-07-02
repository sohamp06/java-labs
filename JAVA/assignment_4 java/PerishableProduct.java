/*
 * Name: Soham Patel
 * Program: PerishableProduct.java
 * Date: July 21 2023
 * Description: Details Of all Products
*/
import java.util.Date;

public class PerishableProduct extends Product {
	
    public PerishableProduct(int sku, String productName, double unitCost, int quantityOnHand, int quantityNeeded, String specialInstructions, Date expiryDate) {
        setid(sku);
        setnameOfProduct(productName);
        setcostingPerUnit(unitCost);
        setinStockItems(quantityOnHand);
        setitemsToOrder(quantityNeeded);
        setinstructionForItems(specialInstructions);
        this.expiryDate = expiryDate;
    }
     
    private Date expiryDate;

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public Date getExpiryDate() {
        return expiryDate;
    }
   
}
