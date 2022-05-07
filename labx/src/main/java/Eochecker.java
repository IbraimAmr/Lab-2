import java.util.Scanner;
public class Eochecker {
        public boolean checker(int number) {
            boolean y = true;

            if (number % 2 == 0)
                System.out.println(number + " is even");
            else System.out.println(number + " is odd");

            return true;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int e = scanner.nextInt();
            var check = new Eochecker();
            check.checker(e);
        }

    }

