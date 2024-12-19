package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWithChar {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Arun", "George", "Hannah", "Akash", "Jane");

        List<String> studentsStartingWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students names starting with letter A: " +studentsStartingWithA);
    }
}


/* Output:
Students names starting with letter A: [Alice, Arun, Akash] */
