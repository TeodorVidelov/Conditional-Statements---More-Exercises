import java.util.Scanner;
public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareMetersGrapes = Integer.parseInt(scanner.nextLine());
        double grapeFromOneSquareMeter = Double.parseDouble(scanner.nextLine());
        int targetWineLiters = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());

        double sumGrapes = squareMetersGrapes * grapeFromOneSquareMeter;
        double convertGrapeToWine = sumGrapes * 0.40 / 2.5;
        double diff = Math.abs(convertGrapeToWine - targetWineLiters);
        if (convertGrapeToWine >= targetWineLiters){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n",Math.floor(convertGrapeToWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(diff),Math.ceil(diff / countWorkers));
        }
        else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(diff));
        }
    }
}