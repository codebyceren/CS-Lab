package Lab1.Lab1Codes;

public class Task3 {

    // generic counting method: it does not know the property, it only asks hasProperty
    public static <T> int countElements(T[] items) {
        int count = 0;
        for (T item : items) {
            if (hasProperty(item)) {    // ask: does this element have the property?
                count++;
            }
        }
        return count;
    }

    // the property lives here: to change it, only change the inside of this method
    public static boolean hasProperty(Object item) {
        int n = (Integer) item;         // cast: convert the Object back to a number
        if (n <= 1) {
            return false;               // 0, 1 and negatives are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;           // found a divisor, so not prime
            }
        }
        return true;                    // no divisor found, so prime
    }

    public static void main(String[] args) {
        Integer[] numbers = {2, 7, 10, 13, 15, 17, 20};

        System.out.print("Collection: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");     // comma between elements
            }
        }
        System.out.println("]");
        System.out.println("Property: Prime numbers");
        System.out.println("Number of elements satisfying the property: " + countElements(numbers));
    }
}