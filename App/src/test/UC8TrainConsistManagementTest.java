import java.util.ArrayList;
import java.util.List;

/**
 * Test Suite for Use Case 8.
 * Verifies the filtering logic against business requirements.
 */
public class UC8TrainConsistManagementTest {

    public static void main(String[] args) {
        UC8TrainConsistManagementApp app = new UC8TrainConsistManagementApp();

        // Setup initial train consist
        List<Bogie> masterList = new ArrayList<>();
        masterList.add(new Bogie("Sleeper", 72));
        masterList.add(new Bogie("AC Chair", 56));
        masterList.add(new Bogie("General", 90));
        masterList.add(new Bogie("First Class", 24));

        System.out.println("=== Running UC8 Stream Filter Tests ===");

        // Test Case 1: Filter High Capacity (> 60)
        List<Bogie> highCap = app.getFilteredBogies(masterList, 60);
        if (highCap.size() == 2) {
            System.out.println("[PASS] testFilter_HighCapacity: Found Sleeper and General.");
        } else {
            System.out.println("[FAIL] testFilter_HighCapacity: Expected 2, found " + highCap.size());
        }

        // Test Case 2: Original List Integrity
        // Ensuring the original master list still has 4 elements
        if (masterList.size() == 4) {
            System.out.println("[PASS] testFilter_OriginalListUnchanged: Master list safe.");
        } else {
            System.out.println("[FAIL] testFilter_OriginalListUnchanged: Master list was modified!");
        }

        // Test Case 3: No Bogies Matching (Extreme threshold)
        List<Bogie> emptyCheck = app.getFilteredBogies(masterList, 200);
        if (emptyCheck.isEmpty()) {
            System.out.println("[PASS] testFilter_NoMatchingBogies: Returns empty list correctly.");
        } else {
            System.out.println("[FAIL] testFilter_NoMatchingBogies: Expected empty list.");
        }

        System.out.println("========================================");
    }
}