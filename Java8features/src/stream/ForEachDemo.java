package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jessica");
        list.add("Jandy");
        list.add("Martin");
        list.add("Leonardo");
        list.add("Kate Elizabeth Wilson");

//        for (String s : list){
//            System.out.println(s);
//        }

       // list.stream().forEach((t)-> System.out.println("List : "+t));
       // list.stream().filter((t)->t.startsWith("K")).forEach((t)-> System.out.println(t));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

//        map.forEach((key,value) -> System.out.println(key+" : "+value));
//        map.entrySet().stream().forEach(System.out::println);

        map.entrySet().stream().filter((t)->t.getKey()%2==0).forEach((v)-> System.out.println(v.getValue()));




    }
}
