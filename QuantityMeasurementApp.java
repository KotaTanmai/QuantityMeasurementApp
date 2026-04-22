public class QuantityMeasurementApp {

    // Step 1: Enum (unit types)
    public enum LengthUnit {

        FEET(1.0),
        INCH(1.0 / 12.0);

        private final double factor;

        LengthUnit(double factor) {
            this.factor = factor;
        }

        public double getFactor() {
            return factor;
        }
    }

    // Step 2: Generic Quantity class
    public static class Quantity {

        private final double value;
        private final LengthUnit unit;

        public Quantity(double value, LengthUnit unit) {

            if (unit == null) {
                throw new IllegalArgumentException("Unit cannot be null");
            }

            this.value = value;
            this.unit = unit;
        }

        // Convert to feet
        private double toFeet() {
            return value * unit.getFactor();
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            Quantity other = (Quantity) obj;

            return Double.compare(
                    this.toFeet(),
                    other.toFeet()
            ) == 0;
        }
    }

    // Step 3: Main method
    public static void main(String[] args) {

        Quantity q1 =
                new Quantity(1.0, LengthUnit.FEET);

        Quantity q2 =
                new Quantity(12.0, LengthUnit.INCH);

        System.out.println(
                "Equal: " + q1.equals(q2)
        );
    }
}