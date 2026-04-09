import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Step 1: Create a HashSet to store unique Bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        System.out.println("--- Registering Bogie IDs ---");

        // Step 2: Adding unique IDs
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");

        // Step 3: Attempting to add duplicate IDs
        // HashSet will check if "BG101" exists and reject the second entry
        bogieIDs.add("BG101");
        bogieIDs.add("BG103");

        System.out.println("Registration process complete.\n");

        // Step 4: Displaying the final set
        System.out.println("Final Train Consist IDs (Unique):");
        System.out.println(bogieIDs);

        // Step 5: Verifying the count
        System.out.println("\nTotal unique bogies registered: " + bogieIDs.size());
    }
}
