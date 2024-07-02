/*
 * Name: Soham Patel
 * Program: Main
 * Date: July 07 2023
 * Description: Details Of Covid-19 Vaccines 
 * */
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Vaccine vaccine_1 = new Vaccine();

        vaccine_1.setId(232137);
        vaccine_1.setName("Pfizer-BioNTech");
        vaccine_1.setCost(20.00);
        vaccine_1.setQuantity(69);
        Calendar calendar_1 = Calendar.getInstance();
        calendar_1.set(2024, Calendar.JANUARY, 31); // Set the year, month, and day
        Date expiryDate1 = calendar_1.getTime();
        vaccine_1.setExpiryDate(expiryDate1);

        Vaccine vaccine_2 = new Vaccine();

        vaccine_2.setId(736290);
        vaccine_2.setName("Sputnik V");
        vaccine_2.setCost(20.99);
        vaccine_2.setQuantity(120);
        Calendar calendar_2 = Calendar.getInstance();
        calendar_2.set(2023, Calendar.OCTOBER, 23); // Set the year, month, and day
        Date expiryDate2 = calendar_2.getTime();
        vaccine_2.setExpiryDate(expiryDate2);

        Vaccine vaccine_3 = new Vaccine();

        vaccine_3.setId(932573);
        vaccine_3.setName("Covishield");
        vaccine_3.setCost(45.00);
        vaccine_3.setQuantity(12);
        Calendar calendar_3 = Calendar.getInstance();
        calendar_3.set(2024, Calendar.MAY, 18); // Set the year, month, and day
        Date expiryDate3 = calendar_3.getTime();
        vaccine_3.setExpiryDate(expiryDate3);

        Vaccine vaccine_4 = new Vaccine();

        vaccine_4.setId(776278);
        vaccine_4.setName("Covaxin");
        vaccine_4.setCost(12.00);
        vaccine_4.setQuantity(4);
        Calendar calendar_4 = Calendar.getInstance();
        calendar_4.set(2023, Calendar.AUGUST, 04); // Set the year, month, and day
        Date expiryDate4 = calendar_4.getTime();
        vaccine_4.setExpiryDate(expiryDate4);

        Vaccine[] vaccines_ = { vaccine_1, vaccine_2, vaccine_3, vaccine_4 };

        System.out.println("Format-1: ");
        System.out.println("\n");
        for (Vaccine vaccine : vaccines_) {
            vaccine.display(true);
        }

        System.out.println("Format-2: ");
        System.out.println("\n");
        for (Vaccine vaccine : vaccines_) {
            vaccine.display(false);
            System.out.println();
        }
    }
}
