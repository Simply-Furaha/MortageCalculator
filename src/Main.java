import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        int principal = 100000;
        float annualInterest = 3.92f;
        int years = 30;
        float MonthlyInterest = annualInterest / 100 / 12;
        int numberOfPayments = years * 12;
        Math.pow(1 + MonthlyInterest, numberOfPayments);
        double mortgage = principal * MonthlyInterest * Math.pow(1 + MonthlyInterest, numberOfPayments) / (Math.pow(1 + MonthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted;
        mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgage);
    }
}
