import java.util.ArrayList;
import java.util.List;

public class UC10TrainConsistManagementTest {

    public static void main(String[] args) {
        UC10TrainConsistManagementApp app = new UC10TrainConsistManagementApp();

        // Setup Test Data
        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));

        System.out.println("=== Running UC10 Aggregation Tests ===");

        // TEST 1: Total Seat Calculation
        // Expected: 72 + 56 + 24 = 152
        int total = app.calculateTotalCapacity(trainConsist);
        if (total == 152) {
            System.out.println("[PASS] testReduce_TotalSeatCalculation: Sum is 152.");
        } else {
            System.out.println("[FAIL] testReduce_TotalSeatCalculation: Expected 152, got " + total);
        }

        // TEST 2: Single Bogie Handling
        List<Bogie> singleBogieList = List.of(new Bogie("Sleeper", 72));
        if (app.calculateTotalCapacity(singleBogieList) == 72) {
            System.out.println("[PASS] testReduce_SingleBogieCapacity");
        } else {
            System.out.println("[FAIL] testReduce_SingleBogieCapacity");
        }

        // TEST 3: Empty Collection Handling
        List<Bogie> emptyList = new ArrayList<>();
        if (app.calculateTotalCapacity(emptyList) == 0) {
            System.out.println("[PASS] testReduce_EmptyBogieList: Returns 0 for empty train.");
        } else {
            System.out.println("[FAIL] testReduce_EmptyBogieList");
        }

        // TEST 4: Original List Integrity
        if (trainConsist.size() == 3) {
            System.out.println("[PASS] testReduce_OriginalListUnchanged");
        } else {
            System.out.println("[FAIL] testReduce_OriginalListUnchanged: Master list was altered!");
        }

        System.out.println("=======================================");
    }
}