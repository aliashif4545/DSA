public class B {

    public static void main(String[] args) {
        String json = "{ \"selectedCountries\": [ " +
                "{ \"countryCode\": \"US\", \"countryName\": \"United States\" }, " +
                "{ \"countryCode\": \"CA\", \"countryName\": \"Canada\" }, " +
                "{ \"countryCode\": \"GB\", \"countryName\": \"United Kingdom\" }, " +
                "{ \"countryCode\": \"IN\", \"countryName\": \"India\" } ] }";

        String countryNameToFind = "India";
        String countryCode = findCountryCode(json, countryNameToFind);

        System.out.println("Country code for \"" + countryNameToFind + "\": " + countryCode);
    }

    public static String findCountryCode(String json, String countryNameToFind) {
        // Remove unnecessary characters and split the string
        json = json.replaceAll("[{}\\[\\]\"]", "");  // Remove braces, brackets, and quotes
        String[] parts = json.split(",");

        String countryName = "";
        String countryCode = "";

        for (String part : parts) {
            part = part.trim();
            if (part.startsWith("countryCode:")) {
                countryCode = part.split(":")[1].trim();
            } else if (part.startsWith("countryName:")) {
                countryName = part.split(":", 2)[1].trim();
                if (countryName.equalsIgnoreCase(countryNameToFind)) {
                    return countryCode;
                }
            }
        }
        return "Not Found";
    }
}
