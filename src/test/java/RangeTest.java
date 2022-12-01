import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    @Test
    void shouldIterateRange(){
    Range range = new Range(1,100);
    int result = 0;
    for (Integer integer : range){
        result += integer;
    }
    assertThat(result).isEqualTo(5050);
    }


}