import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public int add(String values) throws Exception{
        if (values.isEmpty()) {
            return 0;
        } else if (values.length() > 0) {
            int temp;

            List<String> listString = Arrays.asList(values.split("[,|\n]"));


            List<Integer> numberList = new ArrayList<>();
            listString.forEach(number -> numberList.add(Integer.parseInt(number)));
            int accumulator = 0;

            for(Integer number: numberList) {
                accumulator += number;
            }


            //temp = Integer.parseInt(values);
            return accumulator;
        }
         return 0;
    }
}
