package TrainConsistManagement;

import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return "Type=" + type + ", Capacity=" + capacity;
    }
}

// Main class
 class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        // Add bogies
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));

        // 🔹 ALL BOGIES
        System.out.println("All Bogies:");
        list.forEach(System.out::println);

        // 🔹 GROUPING
        Map<String, List<Bogie>> grouped =
                list.stream().collect(Collectors.groupingBy(b -> b.type));

        // 🔹 GROUPED OUTPUT (formatted)
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {

            System.out.println("Bogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("   Capacity: " + b.capacity);
            }
        }
    }
}