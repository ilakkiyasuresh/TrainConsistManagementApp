import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Step 1: Initialize the LinkedList to represent the train chain
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Build the initial train sequence
        // We use addLast to append bogies to the end of the chain
        trainConsist.add("Engine (Loco)");
        trainConsist.add("Sleeper Coach");
        trainConsist.add("AC Chair Car");
        trainConsist.add("Cargo Bogie");
        trainConsist.add("Guard Coach");

        System.out.println("Initial Train Formation:");
        System.out.println(trainConsist);

        // Step 3: Insert a Pantry Car at index 2 (between Sleeper and AC)
        System.out.println("\n--- Attaching Pantry Car at position 2 ---");
        trainConsist.add(2, "Pantry Car");

        // Step 4: Detaching bogies (Removing first and last)
        System.out.println("--- Detaching Engine and Guard Coach for maintenance ---");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 5: Display the final physical sequence
        System.out.println("\nFinal Ordered Train Consist:");
        int position = 1;
        for (String bogie : trainConsist) {
            System.out.println("Position " + position + ": " + bogie);
            position++;
        }
    }
}
