package animals;

public enum Response {
    POSITIVE("Yes"),
    NEGATIVE("No"),
    AMBIGUOUS("");

    private final String reiteration;

    Response(String reiteration) {
        this.reiteration = reiteration;
    }

    public void reiterateResponse() {
        System.out.println("You answered: " + reiteration);
    }
}
