import java.util.List;
import java.util.stream.Collectors;

/**
 * Business Logic for Use Case 8: Filtering.
 * Focuses on declarative data processing using Streams.
 */
public class UC8TrainConsistManagementApp {

    /**
     * Filters a list of bogies based on a minimum capacity threshold.
     * * @param originalConsist The source list of bogies.
     * @param minCapacity The threshold (exclusive).
     * @return A new filtered list containing only matching bogies.
     */
    public List<Bogie> getFilteredBogies(List<Bogie> originalConsist, int minCapacity) {
        return originalConsist.stream()
                .filter(bogie -> bogie.getCapacity() > minCapacity)
                .collect(Collectors.toList());
    }
}

/**
 * Data Model for the Bogie entity.
 */
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() { return type; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return type + " [Cap: " + capacity + "]";
    }
}