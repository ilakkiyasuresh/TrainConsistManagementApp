import java.util.List;

/**
 * Business Logic for Use Case 10: Aggregation.
 * Uses map() to extract capacities and reduce() to sum them up.
 */
public class UC10TrainConsistManagementApp {

    /**
     * Calculates the total seating capacity of the entire train.
     * @param consist The list of bogies attached to the train.
     * @return The mathematical sum of all bogie capacities.
     */
    public int calculateTotalCapacity(List<Bogie> consist) {
        return consist.stream()
                // Step 1: Extract only the capacity (Map Object to Integer)
                .map(bogie -> bogie.getCapacity())
                // Step 2: Sum all values (Reduce to a single result)
                // 0 is the identity (starting value), Integer::sum is the accumulator
                .reduce(0, Integer::sum);
    }
}

/**
 * Data Model for Bogie
 */
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
}