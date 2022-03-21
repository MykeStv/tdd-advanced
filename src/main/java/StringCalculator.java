import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public int add(String values) throws Exception{
        if (values.isEmpty()) {
            return 0;
        } else if (values.length() > 0) {
            int temp;
            String delimiter = "[,|\n]";
            String character = "";
            int numChar = 0;

            while (true) {

                try {
                    temp = Integer.parseInt("" + values.charAt(numChar));
                    break;
                } catch (Exception e) {
                    if("" + values.charAt(0) != "-") {
                        character = "" + values.charAt(numChar);
                        numChar++;
                        delimiter = character.repeat(numChar);
                    }
                }

            }




            List<String> listString = new ArrayList<>();
            if (delimiter != "[,|\n]") {
                listString = List.of(values.substring(numChar).split(delimiter));
            } else {
                listString = List.of(values.split(delimiter));
            }

            List<Integer> numberList = new ArrayList<>();

            listString.forEach(number -> numberList.add(Integer.parseInt(number)));
            int accumulator = 0;

            for(Integer number: numberList) {
                if (number < 0) {
                    throw new Exception("No se permiten numeros negativos");
                }
                if (number > 1000) {
                    continue;
                } else {
                    accumulator += number;
                }

            }


            //temp = Integer.parseInt(values);
            return accumulator;
        }
         return 0;
    }
}
