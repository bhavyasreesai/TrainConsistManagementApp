package TrainConsistManagement;

import java.util.*;

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
        list.add(new Bogie("General", 70));

        // 🔹 DISPLAY ALL BOGIES
        System.out.println("All Bogies:");
        list.forEach(System.out::println);

        // 🔹 TOTAL SEATS USING STREAM
        int totalSeats = list.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // 🔹 DISPLAY TOTAL
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}