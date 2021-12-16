import java.util.Scanner;
public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double price = 0;

        if (kilometers < 20){
            double taxiInitialFee = 0.70;
            if ("day".equals(dayOrNight)){
                price = taxiInitialFee + 0.79 * kilometers;
            }
            else if ("night".equals(dayOrNight)){
                price = taxiInitialFee + 0.90 * kilometers;
            }
        }
        else if (kilometers >= 20 && kilometers < 100){
                price = 0.09 * kilometers;
        }
        else if (kilometers >= 100){
            price = 0.06 * kilometers;
        }
        System.out.printf("%.2f",price);
    }
}