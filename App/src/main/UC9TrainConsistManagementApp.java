import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Business Logic for Use Case 9: Grouping.
 * Uses Collectors.groupingBy to categorize bogies by type.
 */
public class UC9TrainConsistManagementApp {

    /**
     * Groups bogies by their name/type.
     * @param consist The original flat list of bogies.
     * @return A Map where the key is the Bogie Type and the value is a List of those bogies.
     */
    public Map<String, List<Bogie>> groupBogiesByType(List<Bogie> consist) {
        return consist.stream()
                .collect(Collectors.groupingBy(bogie -> bogie.getName()));
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

    @Override
    public String toString() {
        return "Bogie{name='" + name + "', capacity=" + capacity + "}";
    }
}