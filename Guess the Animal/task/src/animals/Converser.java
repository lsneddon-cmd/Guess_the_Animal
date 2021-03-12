package animals;

import java.util.Scanner;

public class Converser {

    private final static Scanner scanner = new Scanner(System.in);

    String response;
    Response confirmedResponse;

    MultiText bye = new MultiText(new String[] {
            "Bye!",
            "Have  nice day!",
            "Farewell",
            "See you later",
            "Toodles",
            "See ya!"
    });

    MultiText clarify = new MultiText(new String[] {
            "Come on, yes or no?",
            "I'm not sure I caught you: was it yes or no?",
            "Funny, I still don't understand, is it yes or no?",
            "Oh, it's too complicated for me: just tell me yes or no.",
            "Could you please simply say yes or no?",
            "Oh, no, don't try to confuse me: say yes or no."
    });

    MultiText askForAnimal = new MultiText(new String[] {"Enter an animal: "});

    public void start() {
        Greeter.greet();

        askForAnimal.printText();
        Animal animal = Animal.createNewAnimal();

        animal.guess();

        while(true) {
            response = scanner.nextLine();
            confirmedResponse = new ResponseConfirmer(response).confirmResponse();

            if (confirmedResponse.equals(Response.AMBIGUOUS)) {
                clarify.printText();
            } else {
                confirmedResponse.reiterateResponse();
                break;
            }
        }

        bye.printText();
    }
}
