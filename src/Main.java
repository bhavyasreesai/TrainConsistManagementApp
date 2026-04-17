package TrainConsistManagement;
import java.util.Arrays;
 class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogieNames = {"Luxury", "General", "Sleeper", "AC Chair", "First Class"};

        System.out.println("Before Sorting:");
        displayBogieNames(bogieNames);

        // Sort bogie names alphabetically using Arrays.sort()
        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting:");
        displayBogieNames(bogieNames);
    }

     // Display bogie names
     public static void displayBogieNames(String[] bogies) {
         for (String bogie : bogies) {
             System.out.print(bogie + " , ");
         }
         System.out.println();
     }
 }