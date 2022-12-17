import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.logging.Logger;

public class Suggestion implements IAmTheTest{
    public ArrayList<String> getSuggestions(String term, ArrayList<String> choices, int numberOfSuggestions) {

        HashMap<String, Integer> termAndValue = new HashMap<String, Integer>();
        for (String choice: choices
             ) {
            termAndValue.put(choice, getDifferenceScore(term, choice));
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer entry : termAndValue.values()) {
            list.add(entry);
        }

        Collections.sort(list);
        ArrayList<String> result = new ArrayList<>();

        for (int val: list
             ) {
            for (String choice: termAndValue.keySet()
            ) {
                if (termAndValue.get(choice) == val)
                    result.add(choice);
            }
        }

        ArrayList<String> finalResult = new ArrayList<>();
        int i = 0;
        while (finalResult.size() < numberOfSuggestions)
        {
            finalResult.add(result.get(i));
            i++;
        }
        Collections.sort(finalResult);
        System.out.println(finalResult);

        Logger log = Logger.getLogger(Suggestion.class.getName());
        log.info(String.valueOf(finalResult));
        return finalResult;
    }

    private int getDifferenceScore(String term, String choice){

        int diff = 0;
        if (choice.length() > term.length()){
            for(int i = 0; i < choice.length(); i++){
                if (!term.contains("" +choice.charAt(i)))
                    diff++;
            }
        }else {
            for(int i = 0; i < term.length(); i++){
                if (!choice.contains("" +term.charAt(i)))
                    diff++;
            }
        }

        return diff;

    }
}
