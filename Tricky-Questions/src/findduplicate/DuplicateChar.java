package findduplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateChar {

    public static void main(String[] args) {
              String input="iloveshriramsingh";

      // Q Find each character occurrence
        String[] result = input.split("");
       // System.out.println(Arrays.toString(result));
        Map<String, Long> map = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        // Q Find all duplicate element from a given String
        List<String> duplicateMap = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                        .map(Map.Entry::getKey)
                                .collect(Collectors.toList());
        System.out.println(duplicateMap);

        // Q Find all unique element from a given string
        List<String> uniqueMap=Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream()
                        .filter(x->x.getValue()==1)
                                .map(Map.Entry::getKey)
                                        .collect(Collectors.toList());
        System.out.println(uniqueMap);

    }
}
