package StringPractice;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VehicleNumber {
    public static void main(String[] args) {

        List<String> vehicleNumbers = Arrays.asList(
                "XX11YY4321",
                "XX31Y1234",
                "MH12AB1234",
                "DL7C1234",
                "AB123XYZ"
        );
        String regex = "^[A-Z]{2}\\d{1,2}[A-Z]{1,2}\\d{4}$";
        Pattern pattern= Pattern.compile(regex);
        vehicleNumbers.stream().forEach(
                number-> {
                    boolean isValid = pattern.matcher(number).matches();
                    System.out.println(number+"--"+isValid);
                }
        );

    }
}
