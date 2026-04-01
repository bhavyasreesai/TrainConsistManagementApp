package TrainConsistManagement;

import java.util.LinkedHashSet;

 class TrainConsistUC5 {
    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Try adding duplicate
        train.add("Sleeper"); // duplicate (will be ignored)

        // Step 4: Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}