package TrainConsistManagement;
import java.util.Arrays;
 class TrainConsistManagementApp {
     public static void main(String[] args) {
         String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

         // Bogie ID to search
         String searchId = "BG309";

         System.out.println("========================================");
         System.out.println("UC19 - Binary Search for Bogie ID");
         System.out.println("========================================");

         System.out.println("\nSorted Bogie IDs:");
         for (String id : bogieIds) {
             System.out.println(id);
         }

         // Perform binary search
         int position = Arrays.binarySearch(bogieIds, searchId);

         // Display result
         if (position >= 0) {
             System.out.println("\nBogie " + searchId + " found using Binary Search at position " + position + ".");
         } else {
             System.out.println("\nBogie " + searchId + " not found in the consist.");
         }

         System.out.println("\nUC19 search completed...");
     }
 }