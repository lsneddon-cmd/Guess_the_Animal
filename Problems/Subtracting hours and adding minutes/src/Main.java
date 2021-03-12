import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        // Inputs date-time
        // hours to subtract, minutes to add
        Scanner scanner = new Scanner(System.in);
        LocalDateTime inputDateTime = LocalDateTime.parse(scanner.nextLine());
        long hoursToSub = scanner.nextInt();
        long minsToAdd = scanner.nextInt();

        System.out.println(addMins(subtractHours(inputDateTime, hoursToSub), minsToAdd));
    }

    private static LocalDateTime subtractHours(LocalDateTime dateTime, long hours) {
        return dateTime.minusHours(hours);
    }

    private static LocalDateTime addMins(LocalDateTime dateTime, long mins) {
        return dateTime.plusMinutes(mins);
    }
}