package animals;

public class Greeter {
    private static boolean hasRan = false;
    private static final String message = PartOfDay.getPartNow();

    private Greeter() {}

    public static void greet() {
        if (!hasRan) {
            System.out.println(Greeter.message);
            hasRan = true;
        } else {
           // Do nothing
        }
    }
}
