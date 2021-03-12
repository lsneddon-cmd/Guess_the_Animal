package animals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ResponseConfirmer {
    private static final String[] positives = {
            "y",
            "yes",
            "yep",
            "yeah",
            "sure",
            "right",
            "affirmative",
            "correct",
            "indeed",
            "you bet",
            "exactly",
            "you said it"
    };
    private static final String[] negatives = {
            "n",
            "no",
            "no way",
            "nah",
            "nope",
            "negative",
            "i don't think so",
            "yeah no"
    };

    private static final Set<String> pos = new HashSet<>(Arrays.asList(positives));
    private static final Set<String> neg = new HashSet<>(Arrays.asList(negatives));

    private final String response;

    public ResponseConfirmer(String response) {
        this.response = response.toLowerCase().trim().replaceFirst("[\\\\.!?]$", "");
    }

    public Response confirmResponse(){
        if (isPositiveResponse(response)) {
            return Response.POSITIVE;
        } else if (isNegativeResponse(response)) {
            return Response.NEGATIVE;
        } else return Response.AMBIGUOUS;
    }

    private static boolean isPositiveResponse(String response) {
        return pos.contains(response);
    }

    private static boolean isNegativeResponse(String response) {
        return neg.contains(response);
    }
}
