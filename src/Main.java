package TrainConsistManagement;
import java.util.*;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return "Type=" + type + ", Cargo=" + cargo;
    }
}

// Main class
 class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<GoodsBogie> list = new ArrayList<>();

        // Add goods bogies
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Open", "Coal"));
        list.add(new GoodsBogie("Box", "Grain"));

        // 🔹 DISPLAY ALL BOGIES
        System.out.println("Goods Bogies:");
        list.forEach(System.out::println);

        // 🔹 SAFETY CHECK using allMatch()
        boolean isSafe = list.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // 🔹 RESULT
        if (isSafe) {
            System.out.println("\nTrain is SAFE ");
        } else {
            System.out.println("\nTrain is UNSAFE ");
        }
    }
}