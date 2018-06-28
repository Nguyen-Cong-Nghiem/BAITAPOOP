import java.util.Scanner;

public class GetStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter symbol: ");
        String symbol = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter previousClosingPrice: ");
        double previousClosingPrice = sc.nextDouble();
        System.out.println("Enter currentPrice: ");
        double currentPrice = sc.nextDouble();
        Stock stock = new Stock(symbol, name, previousClosingPrice, currentPrice);
        System.out.println("Ti le phan tram la: " + stock.layPhanTram());
    }
}
