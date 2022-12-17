import java.util.ArrayList;

public interface IAmTheTest {
    // Example: GetSuggestions("gros", new List<string>(){"gros", "gras", "graisse", "aggressif", "go"}, 2) returns an IEnumerable with ordered terms {"gros", "gras"}

    ArrayList<String> getSuggestions(String term, ArrayList<String> choices, int numberOfSuggestions);
}
