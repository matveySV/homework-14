import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldCompareToYearOfManufacture() {
        Car car1 = new Car(2010, 1.6);
        Car car2 = new Car(2018, 3.5);

        int result = car1.compareTo(car2);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void shouldCompareToEngineCapacity() {
        Car car1 = new Car(2010, 3.5);
        Car car2 = new Car(2018, 1.8);
        double result = car1.getEngineCapacity().compareTo(car2.getEngineCapacity());

        assertThat(result).isEqualTo(1);
    }
}