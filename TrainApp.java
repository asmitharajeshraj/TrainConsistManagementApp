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
    }
}
