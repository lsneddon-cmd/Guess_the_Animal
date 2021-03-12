import java.time.LocalDateTime;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.HOURS;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDateTime inputDateTime = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime beginning = LocalDateTime.of(2017, 1, 1, 0, 0);
        System.out.println(hoursBetweenDates(inputDateTime, beginning));
    }

    private static long hoursBetweenDates(LocalDateTime first, LocalDateTime second) {
        return Math.abs(first.until(second, HOURS));
    }
}