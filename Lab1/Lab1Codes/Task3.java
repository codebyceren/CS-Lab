package Lab1.Lab1Codes;

import java.util.Arrays;

interface Property<T> {
    boolean check(T item);
    String getName();
}

class PrimeProperty implements Property<Integer> {
    public boolean check(Integer n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return "Prime numbers";
    }
}

class OddProperty implements Property<Integer> {
    public boolean check(Integer n) {
        return n % 2 != 0;
    }

    public String getName() {
        return "Odd numbers";
    }
}

public class Task3 {

    public static <T> int countElements(T[] items, Property<T> property) {
        int count = 0;
        for (T item : items) {
            if (property.check(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {2, 7, 10, 13, 15, 17, 20};
        Property<Integer> property = new PrimeProperty();

        System.out.println("Collection: " + Arrays.toString(numbers));
        System.out.println("Property: " + property.getName());
        System.out.println("Number of elements satisfying the property: "
                + countElements(numbers, property));
    }
}