import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Steve on 7/5/2017.
 */
public class BattingStats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int basesEarned;
        int hits = 0;
        int totalBases = 0;


        //1. ask for the number of batters to enter (rows for array)
        System.out.println("Welcome to the Grand Circus Batting Average calculator!");

        //2. ask for number of at bats
        System.out.println("How many at-bats did the batter have?");
        int atBats = scan.nextInt();
        double [] arrAtBats = new double[atBats];

        //3. for each at bat ask for the number of bases earned by the batter
        if (atBats > 0) {
            //4. validate that the user is only entering integer numbers
            System.out.println("To input bases earned please enter:");
            System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

            for (int i = 0; i < atBats; i++) {
                System.out.print("Result for at-bat " + (i + 1) + ":");
                basesEarned = scan.nextInt();
                //put bases earned into array
                arrAtBats[i] = (double) basesEarned;
                //Total at bats that resulted in bases >= 1

                if (basesEarned > 0.0) {
                    hits++;
                }
                totalBases += arrAtBats[i];
            }
        }
        //5. Determine the batting average (total hits/total at-bats)
        double batAvg = (double) hits/atBats;
        double slug = (double) totalBases/atBats;
        System.out.printf("Batting Average: %.3f\n", batAvg);
        System.out.printf("Slugging Percentage: %.3f\n", slug);
    }


    //6. Determine the slugging average (total bases earned/total at bats)

    //7. Round the average to three decimal places

    //8. Print out the array
}

