public class UC11TrainConsistManagementTest {

    public static void main(String[] args) {
        UC11TrainConsistManagementApp validator = new UC11TrainConsistManagementApp();

        System.out.println("=== Running UC11 Regex Validation Tests ===");

        // --- TRAIN ID TESTS ---
        // Valid Format
        printResult("testRegex_ValidTrainID (TRN-1234)", validator.isValidTrainID("TRN-1234"), true);

        // Invalid Formats
        printResult("testRegex_InvalidTrainIDFormat (TRN1234)", validator.isValidTrainID("TRN1234"), false);
        printResult("testRegex_DigitLengthValidation (TRN-123)", validator.isValidTrainID("TRN-123"), false);
        printResult("testRegex_EmptyInput (Empty String)", validator.isValidTrainID(""), false);


        // --- CARGO CODE TESTS ---
        // Valid Format
        printResult("testRegex_ValidCargoCode (PET-AB)", validator.isValidCargoCode("PET-AB"), true);

        // Invalid Formats
        printResult("testRegex_CaseSensitivity (PET-ab)", validator.isValidCargoCode("PET-ab"), false);
        printResult("testRegex_InvalidSuffix (PET-12)", validator.isValidCargoCode("PET-12"), false);
        printResult("testRegex_ExactMatch (PET-ABC)", validator.isValidCargoCode("PET-ABC"), false);

        System.out.println("===========================================");
    }

    private static void printResult(String testName, boolean actual, boolean expected) {
        if (actual == expected) {
            System.out.println("[PASS] " + testName);
        } else {
            System.out.println("[FAIL] " + testName + " | Expected: " + expected + ", Got: " + actual);
        }
    }
}