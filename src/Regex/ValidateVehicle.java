package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateVehicle {
    // XX11YY4321- TRUE
    // XX31Y1234  - TRUE
    public static boolean isValidateVehicleNumber(String vehicleNumber)
    {

        String regex = "^[A-z]{2}\\d{1,2}[A-Z]{1,2}\\d{4}$";
        //[A-Z]{2}--> First 2 Alphabets
        //\\d{1,2} one 0r two digits
        //[A-Z]{1,2} one or two alphabets
        //d{4} four digits

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(vehicleNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] vehicleNumber = {"XX11YY4321", "XX31Y1234", "MH12AB1234", "DL7C1234","as313dv"};
        for (int i = 0; i < vehicleNumber.length; i++) {
            System.out.println(vehicleNumber[i]+ "=="+isValidateVehicleNumber(vehicleNumber[i]));
        }
        String regex = "^[A-z]{2}\\d{1,2}[A-Z]{1,2}\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < vehicleNumber.length; i++) {
            Matcher matcher = pattern.matcher(vehicleNumber[i]);
            //if (matcher.matches())
            //{
                System.out.println(vehicleNumber[i]+" ==" +  matcher.matches());
            //}
        }


    }

}
