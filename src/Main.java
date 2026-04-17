package TrainConsistManagement;

class TrainConsistManagementApp {

    // --- CUSTOM RUNTIME EXCEPTION ---
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // --- GOODS BOGIE CLASS ---
    static class GoodsBogie {
        private String shape;
        private String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {
                // Error message as per expected output
                System.out.println("Error: " + e.getMessage());

            } finally {
                // Exact expected finally message
                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
        }
    }

    public static void main(String[] args) {



        // Safe case
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");
    }
}