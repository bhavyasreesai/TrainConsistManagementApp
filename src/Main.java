package TrainConsistManagement;

 class TrainConsistManagementApp {
    public static void main(String[] args) {
        int[] bogieCapacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        displayCapacities(bogieCapacities);

        bubbleSort(bogieCapacities);

        System.out.println("\nAfter Sorting:");
        displayCapacities(bogieCapacities);
    }

    // Bubble Sort algorithm
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Display bogie capacities
    public static void displayCapacities(int[] capacities) {
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }
        System.out.println();
    }
}


