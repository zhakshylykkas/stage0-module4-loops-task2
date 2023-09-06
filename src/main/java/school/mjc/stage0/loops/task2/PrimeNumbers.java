package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        if (printToInclusive >= 2) {
            int k = 2;
            while (k <= printToInclusive) {
                int count = 0;
                int i = 1;
                while (i <= k) {
                    if (k % i == 0) {
                        count++;
                    }
                    i++;
                }
                if (count == 2) System.out.println(k);
                k++;
            }
        }

//
//
//        int count = 0;
//        if (printToInclusive >= 2) {
//            int i = 1;
//            while (i <= printToInclusive) {
//                if (printToInclusive % i == 0) {
//                    count++;
//                }
//                i++;
//            }
//        }
//
//        if (count == 2) System.out.println(printToInclusive);
    }
}
