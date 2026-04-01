package TrainConsistManagement;

import java.util.HashSet;
import java.util.Set;

 class UniqueBogieTracker {
    public static void main(String[] args) {
        System.out.println("UC3 - Track Unique Bogie IDs (Set – HashSet)");
        System.out.println("============================================");

        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs
        System.out.println("Adding Bogie IDs: BG101, BG102, BG103, BG101");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate, will be ignored

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIDs);

        // Display total count
        System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}

