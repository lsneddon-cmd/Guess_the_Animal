package animals;

import java.util.Scanner;

public class Animal {
    private final Scanner scanner = new Scanner(System.in);
    private String type;
    private String prefix;

    private Animal() {}

    public static Animal createNewAnimal() {
        Animal a = new Animal();
        a.decideOnAnimal();
        return a;
    }

    private String[] parseAnimal() {
        return scanner.nextLine().toLowerCase().split("\\s");
    }

    private void decideOnAnimal() {
        String[] animal = parseAnimal();
        if (animal.length == 1) {
            type = animal[0];
            this.prefix = startsWithVowel(type) ? "an" : "a";
        } else {
            if (animal[0].equals("a") || animal[0].equals("an")) {
                this.prefix = animal[0];
                type = animal[1];
            } else {
                type = String.join(" ", animal);
                this.prefix = startsWithVowel(type) ? "an" : "a";
            }
        }
    }

    public void guess() {
        if (startsWithVowel(type)) {
            System.out.println("Is it " + this.prefix + " " + type + "?");
        } else {
            System.out.println("Is it " + this.prefix + " " + type + "?");
        }
    }

    private static boolean startsWithVowel(String str) {
        switch (str.charAt(0)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
