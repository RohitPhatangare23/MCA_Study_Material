public class GenericMethodS {

    // Generic method to print an array of any type
    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.printf("%s, ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example arrays of different types
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.45, 2.35, 4.63, 8.56};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        // Calling the generic printArray method with different array types
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
