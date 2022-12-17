import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuggestionTest {

    @Test
    public  void suggestion_test_1(){

        List<String> expectedList = new ArrayList<String>(Arrays.asList("mine", "spine"));

        Suggestion suggestion = new Suggestion();
        List<String> actualList = suggestion.getSuggestions("nine", new ArrayList<String>(
                Arrays.asList("mine", "dimes", "shine", "spine", "guidelines")
        ), 2);

        boolean expectedComparison = true;
        boolean actualComparison = actualList.equals(expectedList);

        Assert.assertEquals(expectedComparison, actualComparison);
    }

    @Test
    public  void suggestion_test_2(){

        List<String> expectedList = new ArrayList<String>(Arrays.asList("analogy", "reality"));

        Suggestion suggestion = new Suggestion();
        List<String> actualList = suggestion.getSuggestions("family", new ArrayList<String>(
                Arrays.asList("gravity", "humanity", "randomly", "reality", "analogy")
        ), 2);

        boolean expectedComparison = true;
        boolean actualComparison = actualList.equals(expectedList);

        Assert.assertEquals(expectedComparison, actualComparison);
    }

    @Test
    public  void suggestion_test_3(){

        List<String> expectedList = new ArrayList<String>(Arrays.asList("gras", "gros"));

        Suggestion suggestion = new Suggestion();
        List<String> actualList = suggestion.getSuggestions("gros", new ArrayList<String>(
                Arrays.asList("gros", "gras", "graisse", "aggressif", "go")
        ), 2);

        boolean expectedComparison = true;
        boolean actualComparison = actualList.equals(expectedList);

        Assert.assertEquals(expectedComparison, actualComparison);
    }
}
