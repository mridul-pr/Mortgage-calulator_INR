import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----WELCOME TO MORTGAGE CALCULATOR----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        Integer Principle = scanner.nextInt();

        System.out.print("Enter ANNUAL INTEREST RATE: ");
        Double Rate = scanner.nextDouble();
        Double r  = ((double)Rate/100)/12;

        System.out.print("Enter Period(YEARS): ");
        Integer Period = scanner.nextInt();
        Integer n = Period * 12;

        Double M = Principle*(r*(Math.pow(1+r,n))/(Math.pow(1+r,n)-1));
        System.out.println("Total Mortgage is "+(NumberFormat.getCurrencyInstance().format(M)+" Monthly"));

    }
}