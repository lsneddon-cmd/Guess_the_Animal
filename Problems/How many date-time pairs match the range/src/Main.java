import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        System.out.println(countDatesInRange());
    }

    private static long countDatesInRange() {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime rangeStart = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime rangeEnd = LocalDateTime.parse(scanner.nextLine());
        final int limit = scanner.nextInt();
        if (rangeStart.compareTo(rangeEnd) == 0) {
            return 0;
        } else {
            return Stream.generate(scanner::next)
                    .map(LocalDateTime::parse)
                    .limit(limit)
                    .filter(dateTime -> {
                        return dateTime.compareTo(rangeStart) >= 0
                                && dateTime.compareTo(rangeEnd) < 0;
                    })
                    .count();
        }
    }
}