package TrainConsistManagement;
import java.util.Arrays;
 class TrainConsistManagementApp {
     public static void main(String[] args) {
         try {
             // Example bogie IDs (sorted)
             String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
             String searchId = "BG101";

             System.out.println("========================================");
             System.out.println("UC20 - Exception Handling During Search Operations");
             System.out.println("========================================");

             // Validate before searching
             if (bogieIds == null || bogieIds.length == 0) {
                 throw new IllegalStateException("No bogies available for searching!");
             }

             // Perform binary search
             int position = Arrays.binarySearch(bogieIds, searchId);

             // Handle search result
             if (position >= 0) {
                 System.out.println("\n Bogie " + searchId + " found at position " + position);
             } else {
                 throw new Exception(" Bogie " + searchId + " not found in the consist.");
             }

         } catch (IllegalStateException e) {
             System.out.println("\n Search aborted: " + e.getMessage());
         } catch (Exception e) {
             System.out.println("\n Exception: " + e.getMessage());
         } finally {
             System.out.println("\nUC20 search operation completed safely.");
         }
     }
 }