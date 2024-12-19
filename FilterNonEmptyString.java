package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "" , "bc", "efg", "abcd", "" , "jkl", "" ,"mno");

        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(nonEmptyStrings);
    }
}

/* Output:
[abc, bc, efg, abcd, jkl, mno] */
