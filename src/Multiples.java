public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        int threeMultiples = 0;
        int fiveMultiples = 0;

        while (i < 1000){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3) {
                threeMultiples++;
            }
            if (divisibleBy5) {
                fiveMultiples++;
            }

            i++;
        }

        System.out.println("The total number of non negative multiples of 3 are: " + threeMultiples);
        System.out.println("The total number of non negative multiples of 5 are: " + fiveMultiples);
    }
}
