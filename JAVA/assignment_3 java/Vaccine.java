/*
 * Name: Soham Patel
 * Program: Vaccine
 * Date: July 07 2023
 * Description: Details Of Covid-19 Vaccines 
 * */
import java.util.Date;

public class Vaccine {
    private int VaccineId;
    private String VaccineName;
    private double VaccineCost;
    private int VaccineAvailabel;
    private Date VaccineExpiryDate;

    public Vaccine() {
        // Default constructor
    }

    public Vaccine(int id, String name, double price, int avaliability, Date expiryDate) {
        this.VaccineId = id;
        this.VaccineName = name;
        this.VaccineCost = price;
        this.VaccineAvailabel = avaliability;
        this.VaccineExpiryDate = expiryDate;
    }

    // Setters and Getters
    public void setId(int id) {
        this.VaccineId = id;
    }
    
    public int getId() {
        return VaccineId;
    }

    public void setName(String name) {
        this.VaccineName = name;
    }

    public String getName() {
        return VaccineName;
    }

    public void setCost(double cost) {
        this.VaccineCost = cost;
    }

    public double getCost() {
        return VaccineCost;
    }

    public void setQuantity(int quantity) {
        this.VaccineAvailabel = quantity;
    }

    public int getQuantity() {
        return VaccineAvailabel;
    }

    public void setExpiryDate(Date expiryDate) {
        this.VaccineExpiryDate = expiryDate;
    }

    public Date getExpiryDate() {
        return VaccineExpiryDate;
    }

    

    public void display(boolean table) {
        if (table) {
        	System.out.println("------------------------------------------------------");
            System.out.println("Vaccine ID | Vaccine Name | Unit Cost | QTY | Expiry");
            System.out.println(VaccineId + " | " + VaccineName + " | "+""+ VaccineCost  + " | " + VaccineAvailabel + " | " + (VaccineExpiryDate != null ? VaccineExpiryDate.toString() : ""));
            System.out.println("------------------------------------------------------");
            System.out.println("\n");
        } else {
            System.out.println("Vaccine ID: " + VaccineId);
            System.out.println("Vaccine Name: " + VaccineName);
            System.out.println("Unit Cost: $" + VaccineCost);
            System.out.println("Quantity on hand: " + VaccineAvailabel);
            System.out.println("Expiry Date: " + (VaccineExpiryDate != null ? VaccineExpiryDate.toString() : ""));
        }
    }
}
