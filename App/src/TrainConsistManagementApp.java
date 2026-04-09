import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Step 1: Create a LinkedHashSet to maintain order and uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("--- Building Train Consist (Insertion Order) ---");

        // Step 2: Attach bogies in a specific sequence
        trainFormation.add("Engine (Loco)");
        trainFormation.add("Sleeper Coach");
        trainFormation.add("Cargo Bogie");
        trainFormation.add("Guard Coach");

        // Step 3: Attempting a duplicate attachment
        // In a real yard, you can't have two physical "Sleeper Coach" units
        // with the same ID/Reference.
        System.out.println("Attempting to re-attach 'Sleeper Coach'...");
        trainFormation.add("Sleeper Coach");

        System.out.println("Formation process complete.\n");

        // Step 4: Display the formation
        // Notice the order remains exactly as added: Engine -> Sleeper -> Cargo -> Guard
        System.out.println("Final Train Formation (Unique & Ordered):");
        int seq = 1;
        for (String bogie : trainFormation) {
            System.out.println(seq + ". " + bogie);
            seq++;
        }
    }
}
