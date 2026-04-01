package TrainConsistManagement;

import java.util.HashMap;
import java.util.Map;

 class TrainConsistUC6 {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> trainMap = new HashMap<>();

        // Insert your values
        trainMap.put("First Class", 24);
        trainMap.put("Cargo", 120);
        trainMap.put("Sleeper", 72);
        trainMap.put("AC Chair", 56);

        // Display output
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : trainMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}