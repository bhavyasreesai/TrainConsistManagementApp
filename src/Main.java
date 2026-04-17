package TrainConsistManagement;
import java.util.Arrays;
 class TrainConsistManagementApp {
     public static void main(String[] args) {
         String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

         // Bogie ID to search
         String searchId = "BG309";

         // Display all bogies
         System.out.println("Available Bogie IDs:");
         for (String id : bogieIds) {
             System.out.print(id + " ");
         }
         System.out.println();

         // ---- LINEAR SEARCH LOGIC ----
         boolean found = false;
         int position = -1;

         // Traverse each element sequentially
         for (int i = 0; i < bogieIds.length; i++) {
             if (bogieIds[i].equals(searchId)) {
                 found = true;
                 position = i;
                 break;
             }
         }

         // Display result
         if (found) {
             System.out.println(" Bogie ID " + searchId + " found at position " + position);
         } else {
             System.out.println(" Bogie ID " + searchId + " not found in the consist.");
         }
     }
 }