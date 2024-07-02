import java.util.Scanner;

public class assignment_2 {
    public static void main(String[] args) {
        Scanner input_by_user = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println();

        int number_of_days;
        do {
            System.out.print("Enter the number of days (between 1 and 31): ");
            System.out.println();
            number_of_days = input_by_user.nextInt();
            input_by_user.nextLine();

            if (number_of_days < 1 || number_of_days > 31) {
                System.out.println("Invalid input! Number of days must be between 1 and 31.");
            }
        } while (number_of_days < 1 || number_of_days > 31);

        double[] entered_high_temperature = new double[number_of_days];
        double[] entered_low_temperature = new double[number_of_days];
        double average_of_input = 0.0;
        double min_required_temp = Double.MAX_VALUE;
        double max_required_temp = Double.MIN_VALUE;

        for (int day = 1; day <= number_of_days; day++) {
            System.out.println("Day " + day);

            double min_temperature, max_temperature;
            do {
                System.out.print("Enter the low temperature (-30 to 30): ");
                min_temperature = input_by_user.nextDouble();
                input_by_user.nextLine();

                if (min_temperature < -30 || min_temperature > 30) {
                    System.out.println("Invalid input! Low temperature must be between -30 and 30.");
                }
            } while (min_temperature < -30 || min_temperature > 30);

            do {
                System.out.print("Enter the high temperature (-30 to 30): ");
                max_temperature = input_by_user.nextDouble();
                input_by_user.nextLine();

                if (max_temperature < -30 || max_temperature > 30) {
                    System.out.println("Invalid input! High temperature must be between -30 and 30.");
                } else if (min_temperature > max_temperature) {
                    System.out.println("Invalid input! Low temperature cannot be higher than high temperature.");
                }
            } while (max_temperature < -30 || max_temperature > 30 || min_temperature > max_temperature);

            entered_high_temperature[day - 1] = max_temperature;
            entered_low_temperature[day - 1] = min_temperature;

            double averageTemperature = (max_temperature + min_temperature) / 2;
            System.out.printf("Average temperature for the day: %.1f\n", averageTemperature);

            average_of_input += averageTemperature;
            min_required_temp = Math.min(min_required_temp, min_temperature);
            max_required_temp = Math.max(max_required_temp, max_temperature);

            System.out.println();
        }

        average_of_input /= number_of_days;
        System.out.printf("The average temperature based on the input is:- %.1f\n", average_of_input);

        int cold_day = -1;
        for (int i = 0; i < number_of_days; i++) {
            if (entered_low_temperature[i] == min_required_temp) {
                cold_day = i + 1;
                break;
            }
        }
        System.out.println("On day " + cold_day + " the temperature was lowest.");

        int hot_day = -1;
        for (int i = 0; i < number_of_days; i++) {
            if (entered_high_temperature[i] == max_required_temp) {
                hot_day = i + 1;
                break;
            }
        }
        System.out.println("On day " + hot_day + " the temperature was lowest.");

        input_by_user.close();
    }
}
