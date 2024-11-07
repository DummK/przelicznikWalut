import java.util.Scanner;

interface CurrencyConverter {
    final double USD_TO_PLN_RATE = 3.75;
    final double EUR_TO_PLN_RATE = 4.30;
    final double GBP_TO_PLN_RATE = 5.00;

    void convertToPln(double amount);
    void convertFromPln(double amount);
}

class USDConverter implements CurrencyConverter {
    public void convertToPln(double amount) {
        double temp = amount;
        amount *= USD_TO_PLN_RATE;
        System.out.println(temp + "USD to w przeliczeniu na PLN: " + amount);
    }
    public void convertFromPln(double amount) {
        double temp = amount;
        amount /= USD_TO_PLN_RATE;
        System.out.println(temp + "PLN to w przeliczeniu na USD: " + amount);
    }
}

class EURConverter implements CurrencyConverter {
    public void convertToPln(double amount) {
        double temp = amount;
        amount *= EUR_TO_PLN_RATE;
        System.out.println(temp + "EUR to w przeliczeniu na PLN: " + amount);
    }
    public void convertFromPln(double amount) {
        double temp = amount;
        amount /= EUR_TO_PLN_RATE;
        System.out.println(temp + "PLN to w przeliczeniu na EUR: " + amount);
    }
}

class GBPConverter implements CurrencyConverter {
    public void convertToPln(double amount) {
        double temp = amount;
        amount *= GBP_TO_PLN_RATE;
        System.out.println(temp + "GBP to w przeliczeniu na PLN: " + amount);
    }
    public void convertFromPln(double amount) {
        double temp = amount;
        amount /= GBP_TO_PLN_RATE;
        System.out.println(temp + "PLN to w przeliczeniu na GBP: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        USDConverter usdConverter = new USDConverter();
        EURConverter eurConverter = new EURConverter();
        GBPConverter gbpConverter = new GBPConverter();

        System.out.println("Podaj kwote w PLN: ");
        double amount = scan.nextDouble();
        usdConverter.convertFromPln(amount);
        eurConverter.convertFromPln(amount);
        gbpConverter.convertFromPln(amount);
        System.out.println("Podaj kwote w USD: ");
        amount = scan.nextDouble();
        usdConverter.convertToPln(amount);
        System.out.println("Podaj kwote w EUR: ");
        amount = scan.nextDouble();
        eurConverter.convertToPln(amount);
        System.out.println("Podaj kwote w GBP: ");
        amount = scan.nextDouble();
        gbpConverter.convertToPln(amount);

    }
}