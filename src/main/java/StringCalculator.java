public class StringCalculator {

    public int add(String values) throws Exception{
        if (values.isEmpty()) {
            return 0;
        } else if (values.length() > 0) {
            int temp;
            temp = Integer.parseInt(values);
            return temp;
        }
         return 0;
    }
}
