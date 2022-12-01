import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RangeWithStepTest {

    @Test
    void shouldIterateRangeWithStep(){
        RangeWithStep rangeWithStep = new RangeWithStep(1,100,2);
        int result = 0;
        for (Integer integer : rangeWithStep){
            result += integer;
        }
        assertThat(result).isEqualTo(2500);
    }


}