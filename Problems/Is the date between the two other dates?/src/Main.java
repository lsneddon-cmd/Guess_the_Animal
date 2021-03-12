import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        LocalDate X = LocalDate.parse(input[0]);
        LocalDate M = LocalDate.parse(input[1]);
        LocalDate N = LocalDate.parse(input[2]);

        System.out.println(isXbetweenMandN(X, M, N));
    }

    private static boolean isXbetweenMandN(LocalDate x, LocalDate m, LocalDate n) {
        // m n are equal - false
        // x between m and n - true
        return (x.isBefore(m) && x.isAfter(n)) || (x.isBefore(n) && x.isAfter(m));
    }
}