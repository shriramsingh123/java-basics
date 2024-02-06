package someinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{


    public static void main(String[] args) {

        Supplier<String> supplier=()->"Kate Elizabeth Wilson";
        //System.out.println(supplier.get());

        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println(list.stream().findAny().orElseGet(()-> "Kate Elizabeth Wilson"));

    }


}
