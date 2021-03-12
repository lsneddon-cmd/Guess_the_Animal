import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        System.out.println(findLatestDateTime(parseDateTimeInputs()));
    }

    private static LocalDateTime[] parseDateTimeInputs() {
        final Scanner scanner = new Scanner(System.in);
        LocalDateTime[] result = new LocalDateTime[Integer.parseInt(scanner.nextLine())];
        IntStream.range(0, result.length)
                .forEach(i -> result[i] = LocalDateTime.parse(scanner.nextLine()));
        return result;
    }

    private static LocalDateTime findLatestDateTime(LocalDateTime[] inputs) {
        return Arrays.stream(inputs)
                .sorted(LocalDateTime::compareTo)
                .reduce((val, acc) -> acc)
                .orElseThrow();
    }
}