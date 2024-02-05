package findduplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {

    public static void main(String[] args) {
        String message = "Those who fly alone have the strongest wings " +
                "Those who walk alone have the strongest direction";

        Map<String,Long> map= Arrays.stream(message.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Map.Entry<String, Long>> collect = map.entrySet().
                stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toList());
        System.out.println(map);
        System.out.println(collect);

    }
}
