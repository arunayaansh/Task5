package Task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef" ,"Gh","iJK");

        List<String> upperCaseNames = names.map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);
    }
}


/* Output:
[ABC, D, EF, GH, IJK] */
