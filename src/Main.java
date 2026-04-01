package TrainConsistManagement;

import java.util.ArrayList;
import java.util.List;

 class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initialization details
        System.out.println("Train consist initialized....");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Display current train consist
        System.out.println("Current train consists: " + trainConsist);

        // System ready message
        System.out.println("System ready for operations....");
    }
}
