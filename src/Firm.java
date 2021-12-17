import java.util.Scanner;
public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());
        int countEmployeesWorkOverTime = Integer.parseInt(scanner.nextLine());

        double trainingHours = countDays * 0.90;
        double workingHours = trainingHours * 8;
        double workedOvertime = countEmployeesWorkOverTime * 2 * countDays;
        double totalTime = Math.floor(workingHours + workedOvertime);

        if (neededHours <= totalTime){
            System.out.printf("Yes!%.0f hours left.",Math.abs(totalTime - neededHours));
        }
        else {
            System.out.printf("Not enough time!%.0f hours needed.",Math.abs(totalTime - neededHours));
        }
    }
}