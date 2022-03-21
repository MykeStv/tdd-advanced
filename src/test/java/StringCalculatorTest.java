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

    //Un solo número devuelve el valor
    @Test
    public void singleNumberRerturnValueTest() throws Exception {
        assertThat(stringCalculator.add("2"), is(2));
        assertThat(stringCalculator.add("5"), is(5));
    }

}