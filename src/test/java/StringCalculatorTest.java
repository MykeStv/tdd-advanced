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

    //Dos números, delimitados por comas, devuelven la suma
    @Test
    void twoNumberCommaReturnsSumTest() throws Exception {
        assertThat(stringCalculator.add("2,3"), is(5));
        assertThat(stringCalculator.add("7,9"), is(16));
    }

    //Dos números, delimitados por saltos de línea, devuelve la suma
    @Test
    void twoNumbersNewLineSumTest() throws Exception {
        assertThat(stringCalculator.add("0\n2"), is(2));
        assertThat(stringCalculator.add("3\n2"), is(5));
        assertThat(stringCalculator.add("1\n7"), is(8));
    }

    //Tres números, delimitados de cualquier manera, devuelven la suma
    @Test
    void threeNumbersSumTest() throws Exception {
        assertThat(stringCalculator.add("2,5\n3"), is(10));
        assertThat(stringCalculator.add("1,2\n4"), is(7));
    }

    //Los números negativos arrojan una excepción
    @Test
    void negativeNumbersExceptionTest() throws Exception {

        /*var value = stringCalculator.add("1,-1");*/

        //Es una excepcion por ser numero negativo
        Exception thrown = assertThrows(Exception.class, () -> {
            stringCalculator.add("1,-1");
        });
        assertEquals("No se permiten numeros negativos", thrown.getMessage());

    }

    


}