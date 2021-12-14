import java.util.Scanner;
public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poolVolume = Integer.parseInt(scanner.nextLine());
        int firstPipeFlowForHour = Integer.parseInt(scanner.nextLine());
        int secondPipeFlowForHour = Integer.parseInt(scanner.nextLine());
        double flowingHours = Double.parseDouble(scanner.nextLine());

        double sumFirstPipeFlow = firstPipeFlowForHour * flowingHours;
        double sumSecondPipeFlow = secondPipeFlowForHour * flowingHours;
        double total = sumFirstPipeFlow + sumSecondPipeFlow;
        double percentFilledOfThePool = (total / poolVolume) * 100;
        double percentFlowFirstPipe = (sumFirstPipeFlow / total) * 100;
        double percentFlowSecondPipe = (sumSecondPipeFlow / total) * 100;
        if (poolVolume >= total){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    percentFilledOfThePool,percentFlowFirstPipe,percentFlowSecondPipe);
        }
        else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",flowingHours,total - poolVolume);
        }
    }
}