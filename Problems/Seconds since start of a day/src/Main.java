import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long secondsRead = scanner.nextInt();
        if (secondsRead == 0) {
            // Do nothing
        } else {
            System.out.println(calculateTimeFromSecondsOfDay(secondsRead));
        }

    }

    private static LocalTime calculateTimeFromSecondsOfDay(long seconds) {
        return LocalTime.ofSecondOfDay(seconds);
    }
}