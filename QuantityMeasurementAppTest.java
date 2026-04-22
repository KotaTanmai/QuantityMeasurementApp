import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    // testEquality_SameValue
    @Test
    void testEquality_SameValue() {

        QuantityMeasurementApp.Feet feet1 =
                new QuantityMeasurementApp.Feet(1.0);

        QuantityMeasurementApp.Feet feet2 =
                new QuantityMeasurementApp.Feet(1.0);

        assertTrue(feet1.equals(feet2),
                "1.0 ft should be equal to 1.0 ft");
    }

    // testEquality_DifferentValue
    @Test
    void testEquality_DifferentValue() {

        QuantityMeasurementApp.Feet feet1 =
                new QuantityMeasurementApp.Feet(1.0);

        QuantityMeasurementApp.Feet feet2 =
                new QuantityMeasurementApp.Feet(2.0);

        assertFalse(feet1.equals(feet2),
                "1.0 ft should not equal 2.0 ft");
    }

    // testEquality_NullComparison
    @Test
    void testEquality_NullComparison() {

        QuantityMeasurementApp.Feet feet1 =
                new QuantityMeasurementApp.Feet(1.0);

        assertFalse(feet1.equals(null),
                "Feet should not equal null");
    }

    // testEquality_SameReference
    @Test
    void testEquality_SameReference() {

        QuantityMeasurementApp.Feet feet1 =
                new QuantityMeasurementApp.Feet(1.0);

        assertTrue(feet1.equals(feet1),
                "Same reference should be equal");
    }

    // testEquality_DifferentType
    @Test
    void testEquality_DifferentType() {

        QuantityMeasurementApp.Feet feet1 =
                new QuantityMeasurementApp.Feet(1.0);

        assertFalse(feet1.equals("1.0"),
                "Feet should not equal String");
    }
}