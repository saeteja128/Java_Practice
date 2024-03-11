
    public class String1 {
        public static int canMakeEmpty(String A) {
            // Count occurrences of 'p', 'a', 'm'
            int countP = 0, countA = 0, countM = 0;

            for (char c : A.toCharArray()) {
                if (c == 'p') {
                    countP++;
                } else if (c == 'a') {
                    countA++;
                } else if (c == 'm') {
                    countM++;
                }
            }

            // Check if 'p' and 'a' or 'a' and 'm' pairs exist
            if ((countP > 0 && countA > 0) || (countA > 0 && countM > 0)) {
                return 1; // It is possible to make the string empty
            } else {
                return 0; // It is not possible to make the string empty
            }
        }

        public static void main(String[] args) {
            // Example usage
            String str1 = "pam";
            String str2 = "paaam";
            String str3 = "a";

            System.out.println(canMakeEmpty(str1)); // Output: 1 (Possible)
            System.out.println(canMakeEmpty(str2)); // Output: 1 (Possible)
            System.out.println(canMakeEmpty(str3)); // Output: 0 (Not possible)
            System.out.println(canMakeEmpty("mpampamm"));
            System.out.println(canMakeEmpty("pampampam"));
        }
    }


