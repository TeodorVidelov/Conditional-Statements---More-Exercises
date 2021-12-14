import java.util.Scanner;
public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countHolidays = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - countHolidays;
        int workingDaysPlayedTime = workingDays * 63;
        int holidaysPlayedTime = countHolidays * 127;
        int totalSum = workingDaysPlayedTime + holidaysPlayedTime;
        int diff = Math.abs(totalSum - 30000);
        int hours = Math.abs(diff / 60);
        int minutes = Math.abs(diff % 60);

        if (totalSum > 30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hours,minutes);
        }
        else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hours,minutes);
        }
    }
}