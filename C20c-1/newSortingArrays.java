import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class newSortingArrays {
    public static void main(String[] args) {
// Create an Integer array
        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(
                Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(3)
        ));

// Create a Double array
        ArrayList<Double> doubleArray = new ArrayList<>(Arrays.asList(
                Double.valueOf(3.4), Double.valueOf(1.3), Double.valueOf(-22.1)
        ));

// Create a Character array
        ArrayList<Character> charArray = new ArrayList<>(Arrays.asList(
                Character.valueOf('a'), Character.valueOf('J'), Character.valueOf('r')
        ));

// Create a String array
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList(
                "Tom", "John", "Fred"
        ));

// Sort the arrays
        intArray.sort(Integer::compare);
        doubleArray.sort(Double::compare);
        charArray.sort(Character::compare);
        stringArray.sort(String::compareTo);

// Display the sorted arrays
        System.out.println("Sorted Integer objects: " + intArray);
        System.out.println("Sorted Double objects: " + doubleArray);
        System.out.println("Sorted Character objects: " + charArray);
        System.out.println("Sorted String objects: " + stringArray);
    }
}
