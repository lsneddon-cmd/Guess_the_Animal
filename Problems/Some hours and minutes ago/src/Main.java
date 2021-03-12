import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalTime pointInTime = LocalTime.parse(scanner.nextLine());
        long hours = scanner.nextInt();
        long minutes = scanner.nextInt();

        System.out.println(subtractHoursAndMins(pointInTime, hours, minutes));
    }

    private static LocalTime subtractHoursAndMins(LocalTime start, long hours, long minutes) {
        return start.minusHours(hours).minusMinutes(minutes);
    }
}