package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            int j = 1;
            int factorial = 1;
            while (j <= i) {
                factorial *= j;
                System.out.println(factorial);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
