import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Train consist is initialize");
        
        // Initialize an empty List using ArrayList
        List<Object> trainConsist = new ArrayList<>();
        
        // Display the initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());
        
        System.out.println("\n--- UC2: Add Passenger Bogies ---");
        // Create an ArrayList<String> for passenger bogies
        List<String> passengerBogies = new ArrayList<>();
        
        // Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        
        // Print the list after insertion
        System.out.println("Bogies after adding: " + passengerBogies);
        
        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Bogies after removing AC Chair: " + passengerBogies);
        
        // Use contains() to check if Sleeper exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + hasSleeper);
        
        // Print final list state
        System.out.println("Final list state: " + passengerBogies);
    }
}
