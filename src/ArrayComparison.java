public class ArrayComparison {

    public static void main(String[] args) {
        // Test Case 1
        char[] array1 = {'a', 'b', 'c', 'd'};
        char[] array2 = {'A', 'B', 'C', 'D'};
        boolean result1 = compareArraysIgnoreCase(array1, array2);
        System.out.println("Test Case 1: " + (result1 ? "Passed" : "Failed"));

        // Test Case 2
        char[] array3 = {'j', 'a', 'v', 'a'};
        char[] array4 = {'J', 'A', 'V', 'A'};
        boolean result2 = compareArraysIgnoreCase(array3, array4);
        System.out.println("Test Case 2: " + (result2 ? "Passed" : "Failed"));

        // Test Case 3 - Should fail
        char[] array5 = {'h', 'e', 'l', 'l', 'o'};
        char[] array6 = {'H', 'E', 'L', 'L', 'Z'};
        boolean result3 = compareArraysIgnoreCase(array5, array6);
        System.out.println("Test Case 3: " + (result3 ? "Passed" : "Failed"));
    }

    public static boolean compareArraysIgnoreCase(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (Character.toLowerCase(array1[i]) != Character.toLowerCase(array2[i])) {
                return false;
            }
        }

        return true;
    }
}

