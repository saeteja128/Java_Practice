public class functions2 {

    public int solve(int A, int B, int C) {
        int days = 0;
        int cases = 0;
        int totalCases;

        while (days <= 0) { // Change the condition here if needed
            cases++;
            totalCases = B + C;
            days = totalCases - A;
        }
        return cases;
    }
    //check
    public static void main(String[] args) {
        functions2 functionInstance = new functions2(); // Create an instance of the class
        int result = functionInstance.solve(5, 3, 1);
        System.out.println("Number of days: " + result);
    }
}
