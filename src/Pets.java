import java.util.Scanner;
public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int kgLeftFood = Integer.parseInt(scanner.nextLine());
        double kgFoodForDogPerDay = Double.parseDouble(scanner.nextLine());
        double kgFoodForCatPerDay = Double.parseDouble(scanner.nextLine());
        double grFoodForTurtlePerDay = Double.parseDouble(scanner.nextLine());

        double sumDogFood = kgFoodForDogPerDay * countDays;
        double sumCatFood = kgFoodForCatPerDay * countDays;
        double sumTurtleFood = (grFoodForTurtlePerDay * countDays) / 1000;
        double totalSum = sumDogFood + sumCatFood + sumTurtleFood;

        if (kgLeftFood >= totalSum){
            System.out.printf("%.0f kilos of food left.",Math.floor(kgLeftFood - totalSum));
        }
        else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(totalSum - kgLeftFood));
        }
    }
}