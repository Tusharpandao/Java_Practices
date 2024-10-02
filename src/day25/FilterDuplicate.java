package day25;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDuplicate {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 4, 1);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("List with duplicates removed: " + uniqueNumbers);
    }
}
