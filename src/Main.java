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
}

// Main class
 class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();

        // 🔹 Create large dataset
        for (int i = 0; i < 100000; i++) {
            list.add(new Bogie("Sleeper", 72));
            list.add(new Bogie("AC Chair", 56));
            list.add(new Bogie("First Class", 24));
            list.add(new Bogie("General", 90));
        }

        // 🔹 LOOP-BASED FILTERING
        long startLoop = System.nanoTime();

        for (Bogie b : list) {
            if (b.capacity > 60) {
                // just checking condition (no need to store)
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 STREAM-BASED FILTERING
        long startStream = System.nanoTime();

        list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // 🔹 OUTPUT (ONLY TIME)
        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
    }
}