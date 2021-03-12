import java.time.LocalDateTime;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.HOURS;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime first = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime second = LocalDateTime.parse(scanner.nextLine());

        System.out.println(hoursBetween(first, second));
    }
    private static long hoursBetween(LocalDateTime first, LocalDateTime second) {
        return Math.abs(first.until(second, HOURS));
    }
}