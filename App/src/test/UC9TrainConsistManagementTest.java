import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UC9TrainConsistManagementTest {

    public static void main(String[] args) {
        UC9TrainConsistManagementApp app = new UC9TrainConsistManagementApp();

        // Setup: Two Sleeper bogies, one AC, and one First Class
        List<Bogie> testList = new ArrayList<>();
        testList.add(new Bogie("Sleeper", 72));
        testList.add(new Bogie("Sleeper", 72));
        testList.add(new Bogie("AC Chair", 56));
        testList.add(new Bogie("First Class", 24));

        System.out.println("=== Running UC9 Grouping Tests ===");

        // Execute logic
        Map<String, List<Bogie>> groupedResult = app.groupBogiesByType(testList);

        // TEST 1: Check if groups exist
        if (groupedResult.containsKey("Sleeper") && groupedResult.containsKey("AC Chair")) {
            System.out.println("[PASS] testGrouping_MapContainsCorrectKeys");
        } else {
            System.out.println("[FAIL] Missing grouping keys");
        }

        // TEST 2: Validate group size (Sleeper should have 2 entries)
        if (groupedResult.get("Sleeper").size() == 2) {
            System.out.println("[PASS] testGrouping_MultipleBogiesInSameGroup");
        } else {
            System.out.println("[FAIL] Sleeper group size mismatch");
        }

        // TEST 3: Original list integrity
        if (testList.size() == 4) {
            System.out.println("[PASS] testGrouping_OriginalListUnchanged");
        } else {
            System.out.println("[FAIL] Original list was modified!");
        }

        // Display results for visualization
        System.out.println("\n--- Final Grouped Report ---");
        groupedResult.forEach((type, list) -> {
            System.out.println("Type: " + type + " | Count: " + list.size());
            list.forEach(b -> System.out.println("  -> " + b));
        });

        System.out.println("==================================");
    }
}