import java.text.DecimalFormat;

public class StringSample {
    public static void main(String[] args) {
        double floatValue = 123.456789;

        // Create a DecimalFormat object with one decimal place
        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        // Apply the format to the float value
        String roundedValue = decimalFormat.format(floatValue);

        // Parse the formatted string back to a double
        double roundedFloat = Double.parseDouble(roundedValue);

        // Print the rounded value
        System.out.println("Original value: " + floatValue);
        System.out.println("Rounded value: " + roundedFloat);
    }
}
