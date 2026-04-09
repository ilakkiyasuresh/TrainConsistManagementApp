import java.util.ArrayList;
import java.util.List;

public class UC12TrainConsistManagementTest {

    public static void main(String[] args) {
        UC12TrainConsistManagementApp safetyApp = new UC12TrainConsistManagementApp();

        System.out.println("=== Running UC12 Safety Compliance Tests ===");

        // TEST 1: All Bogies Valid
        List<GoodsBogie> validTrain = List.of(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal")
        );
        printResult("testSafety_AllBogiesValid", safetyApp.checkSafetyCompliance(validTrain), true);

        // TEST 2: Cylindrical with Invalid Cargo (Violation)
        List<GoodsBogie> hazardousTrain = List.of(
                new GoodsBogie("Cylindrical", "Coal"), // Violation!
                new GoodsBogie("Rectangular", "Grain")
        );
        printResult("testSafety_CylindricalWithInvalidCargo", safetyApp.checkSafetyCompliance(hazardousTrain), false);

        // TEST 3: Empty List (Safe by default)
        List<GoodsBogie> emptyTrain = new ArrayList<>();
        printResult("testSafety_EmptyBogieList", safetyApp.checkSafetyCompliance(emptyTrain), true);

        // TEST 4: Non-Cylindrical Flexibility
        List<GoodsBogie> diverseTrain = List.of(
                new GoodsBogie("Rectangular", "Chemicals"),
                new GoodsBogie("Open", "Iron Ore")
        );
        printResult("testSafety_NonCylindricalBogiesAllowed", safetyApp.checkSafetyCompliance(diverseTrain), true);

        System.out.println("============================================");
    }

    private static void printResult(String testName, boolean actual, boolean expected) {
        String status = (actual == expected) ? "[PASS]" : "[FAIL]";
        System.out.println(status + " " + testName + " | Result: " + (actual ? "SAFE" : "UNSAFE"));
    }
}