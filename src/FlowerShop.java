import java.util.Scanner;
public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMagnolia = Integer.parseInt(scanner.nextLine());
        int countHyacinth = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countCactus = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double sumMagnolia = countMagnolia * 3.25;
        double sumHyacinth = countHyacinth * 4;
        double sumRoses = countRoses * 3.50;
        double sumCactus = countCactus * 8;

        double totalSumMinusTax = (sumMagnolia + sumHyacinth + sumRoses + sumCactus) * 0.95;
        double diff = Math.abs(totalSumMinusTax - presentPrice);

        if (presentPrice <= totalSumMinusTax){
            System.out.printf("She is left with %.0f leva.",Math.floor(diff));
        }
        else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(diff));
        }
    }
}