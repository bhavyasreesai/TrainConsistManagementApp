package TrainConsistManagement;

import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
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
        list.add(new Bogie("General", 90));

        // 🔹 ORIGINAL LIST
        System.out.println("Original Bogie List:");
        list.forEach(System.out::println);

        // 🔹 FILTER using Stream (capacity > 60)
        List<Bogie> filteredList = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 🔹 FILTERED LIST
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredList.forEach(System.out::println);
    }
}