import java.util.Scanner;

public class force {
    String equilibrium(int n, int forces[][]) {
        if (n >= 1 && n <= 100) {
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < 3; col++) {
                    if (forces[row][col] > 100 || forces[row][col] < -100)
                        return "The forces are out of bounds";
                }
            }
            int forceSum = 0;
            for (int col = 0; col < 3; col++) {
                for (int row = 0; row < n; row++)
                    forceSum = forceSum + forces[row][col];
            }
            if (forceSum == 0)
                return "YES";
            return "NO";
        }
        return "The number of forces is out of bounds";
    }
}