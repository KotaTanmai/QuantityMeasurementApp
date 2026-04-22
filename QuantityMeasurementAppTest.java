import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testFeetEquality_SameValue() {

        assertTrue(
            QuantityMeasurementApp.checkFeetEquality(1.0, 1.0)
        );
    }

    @Test
    void testFeetEquality_DifferentValue() {

        assertFalse(
            QuantityMeasurementApp.checkFeetEquality(1.0, 2.0)
        );
    }

    @Test
    void testInchesEquality_SameValue() {

        assertTrue(
            QuantityMeasurementApp.checkInchesEquality(1.0, 1.0)
        );
    }

    @Test
    void testInchesEquality_DifferentValue() {

        assertFalse(
            QuantityMeasurementApp.checkInchesEquality(1.0, 2.0)
        );
    }

    @Test
    void testEquality_NullComparison() {

        QuantityMeasurementApp.Feet feet =
                new QuantityMeasurementApp.Feet(1.0);

        assertFalse(feet.equals(null));
    }

    @Test
    void testEquality_SameReference() {

        QuantityMeasurementApp.Inches inch =
                new QuantityMeasurementApp.Inches(1.0);

        assertTrue(inch.equals(inch));
    }
}