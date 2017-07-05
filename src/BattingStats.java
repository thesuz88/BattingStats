import java.util.Scanner;

/**
 * Created by Steve on 7/5/2017.
 */
public class BattingStats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. ask for the number of batters to enter (rows for array)
        System.out.println("How many batters would you like to enter: ");
        int numBatters = scan.nextInt();

        double [][] result = new double[numBatters][];

        //2. ask for number of at bats
        for (int i = 0; i < numBatters ; i++) {

            System.out.println("How many at-bats did batter " + (i+1) + " have?");
            int atBats = scan.nextInt();

            //3. for each at bat ask for the number of bases earned by the batter
            if (atBats > 0){
                System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
                for (int j = 0; j < atBats; j++){
                    System.out.print("Result for at-bat " + (j+1) + ":");
                    int basesEarned = scan.nextInt();
                }
            }
        }


        //4. validate that the user is only entering integer numbers

        //5. Determine the batting average (total at-bats >= 1 base/total at-bats)

        //6. Determine the slugging average (total bases earned/total at bats)

        //7. Round the average to three decimal places

        //8. Print out the array
    }
}
