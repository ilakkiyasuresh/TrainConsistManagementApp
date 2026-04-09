import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Step 1: Create a HashMap where Key is Bogie Type (String)
        // and Value is Capacity (Integer)
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("--- Mapping Bogie Capacities ---");

        // Step 2: Use put() to associate Bogies with their respective capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair Car", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo (Rectangular)", 1000); // 1000 kg capacity
        bogieCapacityMap.put("Cargo (Cylindrical)", 850);  // 850 kg capacity

        // Step 3: Iterate through the Map using entrySet()
        // This allows us to access both the Key and the Value simultaneously
        System.out.println("\nBogie Operational Attributes:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Step 4: Fast lookup example
        String query = "Sleeper";
        System.out.println("\nQuick Search: The capacity of '" + query +
                "' is " + bogieCapacityMap.get(query) + " seats.");
    }
}
