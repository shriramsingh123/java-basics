package someinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> consumer=(t)-> System.out.println("List : "+t);

         list.stream().forEach((t)-> System.out.println("print : "+t));
    }
}
