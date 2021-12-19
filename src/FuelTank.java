import java.util.Locale;
import java.util.Scanner;
public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        double litersFuelInTank = Double.parseDouble(scanner.nextLine());



        if (litersFuelInTank >= 25) {

            if ("Diesel".equals(typeFuel)) {
                System.out.printf("You have enough %s.", typeFuel.toLowerCase());
            }
            else if ("Gasoline".equals(typeFuel)) {
                System.out.printf("You have enough %s.", typeFuel.toLowerCase());
            }
            else if ("Gas".equals(typeFuel)) {
                System.out.printf("You have enough %s.", typeFuel.toLowerCase());
            }
            else {
                System.out.println("Invalid fuel!");
            }
        }
        else if (litersFuelInTank < 25){
            if ("Diesel".equals(typeFuel)){
                 System.out.printf("Fill your tank with %s!",typeFuel.toLowerCase());
            }
            else if ("Gasoline".equals(typeFuel)){
                System.out.printf("Fill your tank with %s!",typeFuel.toLowerCase());
            }
            else if ("Gas".equals(typeFuel)){
                System.out.printf("Fill your tank with %s!",typeFuel.toLowerCase());
            }
            else {
                System.out.println("Invalid fuel!");
            }
        }
    }
}