import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class StringCalculatorTest {

    public StringCalculator stringCalculator = new StringCalculator();

    // Cadena vacia devuelve cero
    @Test
    public void emptyStringTest() throws Exception {

        assertThat(stringCalculator.add(""), is(0));
        
    }

}