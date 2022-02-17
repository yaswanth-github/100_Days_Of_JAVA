import java.util.Scanner;

public class Pra1 {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            // Enter annual income
            double income = scan.nextDouble();
            // Enter age
            int age = scan.nextInt();

            double minimumAllowedIncome;

            if ((age > 60) && (age <= 80)) {
                minimumAllowedIncome = 300000;
            } else if (age > 80) {
                minimumAllowedIncome = 500000;
            } else {
                minimumAllowedIncome = 250000;
            }
            double tax = 0.0;
            if (income > minimumAllowedIncome && income <= 500000.00) {
                tax = 0.1 * (income - minimumAllowedIncome);
            } else if (income > 500000.00 && income <= 1000000.00) {
                tax = 0.1 * (500000 - minimumAllowedIncome) + 0.2 * (income - 500000);
            } else if (income > 1000000.00) {
                tax = 0.1 * (500000 - minimumAllowedIncome) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);
            }
            System.out.print(tax);
            scan.close();
        }
    }