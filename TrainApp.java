import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        // UC1: Initialize Train and Display Consist Summary
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Train consist is initialize");
        
        List<Object> trainConsist = new ArrayList<>();
        System.out.println("Initial bogie count: " + trainConsist.size());
        
        // UC2: Add Passenger Bogies to Train
        System.out.println("\n--- UC2: Add Passenger Bogies ---");
        List<String> passengerBogies = new ArrayList<>();
        
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        
        System.out.println("Bogies after adding: " + passengerBogies);
        
        passengerBogies.remove("AC Chair");
        System.out.println("Bogies after removing AC Chair: " + passengerBogies);
        
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Does Sleeper exist? " + hasSleeper);
        
        System.out.println("Final state of passenger bogies: " + passengerBogies);
        
        // UC3: Track Unique Bogie IDs (Set - HashSet)
        System.out.println("\n--- UC3: Track Unique Bogie IDs ---");
        Set<String> uniqueBogieIDs = new HashSet<>();
        
        // Add duplicate values intentionally
        uniqueBogieIDs.add("BG101");
        uniqueBogieIDs.add("BG102");
        uniqueBogieIDs.add("BG103");
        uniqueBogieIDs.add("BG101"); // This duplicate will be ignored
        
        // Print the final set
        System.out.println("Unique Bogie IDs: " + uniqueBogieIDs);
    }
}
