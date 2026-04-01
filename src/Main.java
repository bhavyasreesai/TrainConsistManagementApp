package TrainConsistManagement;
import java.util.*;

// 🔹 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Passenger Bogie class
class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return "Type=" + type + ", Capacity=" + capacity;
    }
}

// 🔹 Main class
 class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<PassengerBogie> list = new ArrayList<>();

        try {
            // Valid bogies
            list.add(new PassengerBogie("Sleeper", 72));
            list.add(new PassengerBogie("AC Chair", 56));

            //  Invalid bogie (will throw exception)
            list.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 🔹 Display valid bogies
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : list) {
            System.out.println(b);
        }
    }
}