import java.lang.*;
import java.util.*;
import java.text.DecimalFormat;

import static java.lang.Math.round;

public class functions1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        double height = sc.nextInt();
        double weight = sc.nextInt();

        double heightInMts = height / 100.0;

        double calculateBMI = weight/(heightInMts*heightInMts);

        DecimalFormat df = new DecimalFormat("#.#");
        String roundedValue = df.format(calculateBMI);
        double roundedFloat = Double.parseDouble(roundedValue);

        System.out.println("BMI: " +roundedFloat);

        if(roundedFloat<18.5)
        {
            System.out.println("Underweight");
            System.out.println(roundedFloat);
        } else if (roundedFloat >= 18.5 && roundedFloat <= 24.9) {
            System.out.println("Normal");
            System.out.println(roundedFloat);            
        } else if (roundedFloat >= 24.9 && roundedFloat <= 29.9) {
            System.out.println("Overweight");
            System.out.println(roundedFloat);
        } else if (roundedFloat>29.9) {
            System.out.println("Obese");
            System.out.println(roundedFloat);
        }

    }
}