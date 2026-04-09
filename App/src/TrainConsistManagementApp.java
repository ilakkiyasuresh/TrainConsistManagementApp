import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize Train and Display Consist Summary
 * This class serves as the entry point for the Train Consist Management App.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        // 1. Display Welcome Message
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Initializing the railway system...");

        /* * 2. Initialize an empty List using ArrayList.
         * We use the List interface as the type for flexibility (Abstraction),
         * and ArrayList as the implementation because it's resizable.
         * For now, we use String to represent bogie names/IDs.
         */
        List<String> trainConsist = new ArrayList<>();

        // 3. Display the initial bogie count
        // The size() method returns the number of elements currently in the list.
        int initialCount = trainConsist.size();

        System.out.println("Current Consist Summary:");
        System.out.println("Total Bogies attached to Engine: " + initialCount);

        if (initialCount == 0) {
            System.out.println("Status: The engine is currently standing alone. Ready for assembly.");
        }

        System.out.println("------------------------------------");
        System.out.println("Program continues... Ready for next Use Case.");
    }
}
