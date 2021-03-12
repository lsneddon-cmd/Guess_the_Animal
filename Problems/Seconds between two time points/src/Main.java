import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        LocalTime firstTime = LocalTime.parse(scanner.nextLine());
        LocalTime secondTime = LocalTime.parse(scanner.nextLine());

        System.out.println(secondDifference(firstTime, secondTime));
    }

    private static long secondDifference(LocalTime first, LocalTime second) {
        return Math.abs(getSecondsFromTime(first) - getSecondsFromTime(second));
    }

    private static long getSecondsFromTime(LocalTime time) {
        return time.getSecond() + 60 * time.getMinute() + 60 * 60 * time.getHour();
    }

}