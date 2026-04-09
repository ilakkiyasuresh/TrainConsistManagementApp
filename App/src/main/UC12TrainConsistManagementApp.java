import java.util.List;

/**
 * Business Logic for Use Case 12: Safety Compliance.
 * Enforces specific cargo rules for different bogie shapes.
 */
public class UC12TrainConsistManagementApp {

    /**
     * Performs a safety audit on the goods bogies.
     * Rule: If a bogie is "Cylindrical", its cargo MUST be "Petroleum".
     * * @param goodsConsist List of goods bogies to validate.
     * @return true if all bogies satisfy safety rules; false otherwise.
     */
    public boolean checkSafetyCompliance(List<GoodsBogie> goodsConsist) {
        // Use allMatch for short-circuiting validation
        return goodsConsist.stream().allMatch(bogie -> {
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }
            // Non-cylindrical bogies (Rectangular/Open) are flexible in this UC
            return true;
        });
    }
}

/**
 * Data Model for Goods Bogie
 */
class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }
}