package someinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{

    public static void main(String[] args) {

       //Predicate<Integer> predicate = (t)-> t % 2 ==0;

        //System.out.println( predicate.test(125));

        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8);
        list.stream().filter((t) -> t % 2 ==0).forEach((t)-> System.out.println("print Even : "+t));

    }
}
