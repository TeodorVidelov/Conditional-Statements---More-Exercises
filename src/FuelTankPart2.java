import java.util.Scanner;
public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        double litersFuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double sum = 0;
        if ("Gasoline".equals(typeFuel)){
            double priceGasoline = 2.22;
            if ("Yes".equals(clubCard)) {
                priceGasoline -= 0.18;
            }
            sum = priceGasoline * litersFuel;
        }
        else if ("Diesel".equals(typeFuel)){
            double priceDiesel = 2.33;
            if ("Yes".equals(clubCard)) {
                priceDiesel -= 0.12;
            }
            sum = priceDiesel * litersFuel;
        }
        else if ("Gas".equals(typeFuel)) {
            double priceGas = 0.93;
            if ("Yes".equals(clubCard)){
                priceGas -= 0.08;
            }
            sum = priceGas * litersFuel;
        }
        if (litersFuel >= 20 && litersFuel <= 25){
                sum *= 0.92;
        }
        else if (litersFuel > 25){
            sum *= 0.90;
        }
        System.out.printf("%.2f lv.",sum);
    }
}