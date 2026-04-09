import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Step 1: Create a custom Bogie class to hold multiple attributes
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%-15s | Capacity: %d seats", name, capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Step 2: Create a List to store Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();

        // Step 3: Add bogie objects to the list
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("AC Chair Car", 56));
        passengerBogies.add(new Bogie("Executive Class", 36));

        System.out.println("--- Unsorted Bogie List ---");
        passengerBogies.forEach(System.out::println);

        // Step 4: Define sorting logic using a Comparator
        // We are sorting by capacity in ascending order
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\n--- Bogies Sorted by Capacity (Ascending) ---");
        passengerBogies.forEach(System.out::println);

        // Bonus: Sorting in Descending order for high-capacity planning
        passengerBogies.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\n--- Bogies Sorted by Capacity (Descending/Priority) ---");
        passengerBogies.forEach(System.out::println);
    }
}
