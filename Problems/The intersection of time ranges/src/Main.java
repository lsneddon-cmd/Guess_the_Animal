import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineOne = scanner.nextLine().split(" ");
        String[] lineTwo = scanner.nextLine().split(" ");



        System.out.println(intersection(
                LocalTime.parse(lineOne[0]),
                LocalTime.parse(lineOne[1]),
                LocalTime.parse(lineTwo[0]),
                LocalTime.parse(lineTwo[1])
        ));
    }

    private static boolean intersection(LocalTime fStart, LocalTime fEnd, LocalTime sStart, LocalTime sEnd) {
        return sStart.compareTo(fEnd) <= 0 && sStart.compareTo(fStart) >= 0 || sEnd.compareTo(fStart) >= 0 && sEnd.compareTo(fEnd) <= 0
                ||
                fEnd.compareTo(sStart) <= 0 && fStart.compareTo(sStart) >= 0 || fStart.compareTo(sEnd) >= 0 && fEnd.compareTo(sEnd) <= 0
                || fStart.compareTo(sStart) > 0 && fEnd.compareTo(sEnd) < 0 || sStart.compareTo(fStart) > 0 && sEnd.compareTo(fEnd) < 0;
    }
}