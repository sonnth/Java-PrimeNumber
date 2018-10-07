public class PrimeNumberLowerThan100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int num = 2;
            boolean check = true;
            while (num <= Math.sqrt(i)) {
                if (i % num == 0) {
                    check = false;
                    break;
                }
                num++;
            }
            if (check) {
                System.out.println(i + " is a prime and lower than 100");
            }
        }
    }
}
