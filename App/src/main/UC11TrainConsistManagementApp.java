import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Business Logic for Use Case 11: Format Validation.
 * Uses Regex to enforce naming conventions for Train IDs and Cargo Codes.
 */
public class UC11TrainConsistManagementApp {

    // Regex for Train ID: Must start with 'TRN-' followed by exactly 4 digits
    private static final String TRAIN_ID_REGEX = "^TRN-\\d{4}$";

    // Regex for Cargo Code: Must start with 'PET-' followed by exactly 2 uppercase letters
    private static final String CARGO_CODE_REGEX = "^PET-[A-Z]{2}$";

    private final Pattern trainPattern;
    private final Pattern cargoPattern;

    public UC11TrainConsistManagementApp() {
        // Compiling patterns once for efficiency
        this.trainPattern = Pattern.compile(TRAIN_ID_REGEX);
        this.cargoPattern = Pattern.compile(CARGO_CODE_REGEX);
    }

    public boolean isValidTrainID(String trainID) {
        if (trainID == null) return false;
        Matcher matcher = trainPattern.matcher(trainID);
        return matcher.matches();
    }

    public boolean isValidCargoCode(String cargoCode) {
        if (cargoCode == null) return false;
        Matcher matcher = cargoPattern.matcher(cargoCode);
        return matcher.matches();
    }
}