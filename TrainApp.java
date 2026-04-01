import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
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
        
        // UC4: Maintain Ordered Bogies (LinkedList)
        System.out.println("\n--- UC4: Maintain Ordered Bogies (LinkedList) ---");
        LinkedList<String> consist = new LinkedList<>();
        
        // Add bogies: Engine, Sleeper, AC, Cargo, Guard.
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");
        
        System.out.println("Initial Train Consist: " + consist);
        
        // Insert a Pantry Car at position 2.
        consist.add(2, "Pantry Car");
        System.out.println("Consist after inserting Pantry Car at index 2: " + consist);
        
        // Remove the first and last bogie.
        consist.removeFirst();
        consist.removeLast();
        
        // Display the final ordered train consist.
        System.out.println("Final ordered train consist after removals: " + consist);
        
        // UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
        System.out.println("\n--- UC5: Preserve Insertion Order (LinkedHashSet) ---");
        Set<String> formation = new LinkedHashSet<>();
        
        // Attach bogies such as: Engine, Sleeper, Cargo, Guard.
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        
        // Attempt to attach a duplicate bogie intentionally
        formation.add("Sleeper"); 
        
        // Display the final formation order
        System.out.println("Final Train Formation: " + formation);
    }
}
