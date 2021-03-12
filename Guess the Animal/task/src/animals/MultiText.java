package animals;

public class MultiText {
    private String[] text;

    private String getRandomText() {
        return text[(int) Math.floor(Math.random() * text.length)];
    }

    public MultiText(String[] text) {
        this.text = text;
    }

    public void printText() {
        System.out.println(getRandomText());
    }
}
