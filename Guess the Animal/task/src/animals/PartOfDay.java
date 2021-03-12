package animals;

import java.time.LocalTime;

public enum PartOfDay {
    MORNING(LocalTime.parse("05:00"), LocalTime.parse("12:00"), "Good morning"),
    AFTERNOON(LocalTime.parse("12:00"), LocalTime.parse("18:00"), "Good afternoon"),
    EVENING(LocalTime.parse("18:00"), LocalTime.parse("22:00"), "Good Evening"),
    NIGHT(LocalTime.parse("22:00"), LocalTime.parse("02:00"), "Hi, Night Owl"),
    EARLY(LocalTime.parse("02:00"), LocalTime.parse("05:00"), "Hi, Early Bird");

    private final LocalTime start;
    private final LocalTime end;
    private final String greeting;

    PartOfDay(LocalTime start, LocalTime end, String greeting) {
        this.start = start;
        this.end = end;
        this.greeting = greeting;
    }

    public static String getPartNow() {
        LocalTime now = LocalTime.now();
        if (now.compareTo(MORNING.start) >= 0 && now.isBefore(MORNING.end)) {
            return MORNING.greeting;
        } else if (now.compareTo(AFTERNOON.start) >= 0 && now.isBefore(AFTERNOON.end)) {
            return AFTERNOON.greeting;
        } else if (now.compareTo(EVENING.start) >= 0 && now.isBefore(EVENING.end)) {
            return EVENING.greeting;
        } else if (now.compareTo(NIGHT.start) >= 0 && now.isBefore(NIGHT.end)) {
            return NIGHT.greeting;
        } else return EARLY.greeting;
    }
}
