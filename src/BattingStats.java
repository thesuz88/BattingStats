import java.util.Scanner;

/**
 * Created by Steve on 7/5/2017.
 */
public class BattingStats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basesEarned = 0;
        int hits = 0;
        int atBats = 0;
        int totalBases = 0;
        String repeat = "y";
        boolean isNum;
        boolean isValid = false;

        System.out.println("Welcome to the Grand Circus Batting Average calculator!");

        while (repeat.equalsIgnoreCase("y")) {
            //1. ask for number of at bats
            System.out.println("How many at-bats did the batter have?");
            do {
                if (scan.hasNextInt()) {//having trouble with negatives
                    atBats = scan.nextInt();
                    isNum = true;

                } else {
                    System.out.println("Invalid entry. Enter number of at-bats.");
                    scan.nextLine();
                    isNum =false;
                }

            } while (!isNum);

            double[] arrAtBats = new double[atBats];

            //2. for each at bat ask for the number of bases earned by the batter
            //3. validate that the user is only entering integer numbers
            System.out.println("To input bases earned please enter:");
            System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

            for (int i = 0; i < atBats; i++) {
               do{
                   System.out.print("Result for at-bat " + (i + 1) + ":");
                   if (scan.hasNextInt()) {
                       basesEarned = scan.nextInt();
                       isValid = true;
                   }else{
                       scan.nextLine();
                       isValid = false;
                   }
                    scan.nextLine();
               }while (basesEarned < 0 || basesEarned > 4 || !isValid);

                //put bases earned into array
                arrAtBats[i] = (double) basesEarned;

                //Total at bats that resulted in bases >= 1
                if (basesEarned > 0.0) {
                    hits++;
                }
                totalBases += arrAtBats[i];
            }

            //4. Determine the batting average (total hits/total at-bats)
            double batAvg = (double) hits / atBats;
            double slug = (double) totalBases / atBats;
            System.out.printf("Batting Average: %.3f\n", batAvg);
            System.out.printf("Slugging Percentage: %.3f\n", slug);
            System.out.println();
            System.out.println("Would you like to enter another batter? (y/n)");
            scan.nextLine(); //cleans out scanner
            repeat = scan.nextLine();
        }
    }
}

