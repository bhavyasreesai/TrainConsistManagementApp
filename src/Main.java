package TrainConsistManagement;

import java.util.*;

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

// Main class (as require
class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        // Add bogies
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("General", 90));

        // BEFORE SORTING
        System.out.println("Before Sorting:");
        for (Bogie b : list) {
            System.out.println(b);
        }

        // SORTING (Ascending)
        list.sort(Comparator.comparingInt(b -> b.capacity));

        // AFTER SORTING
        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : list) {
            System.out.println(b);
        }
    }
}