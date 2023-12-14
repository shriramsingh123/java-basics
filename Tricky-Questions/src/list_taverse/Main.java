package list_taverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jessica");
        list.add("Jandy");
        list.add("jeorge");
        list.add("Shelby");
        list.add("Andres");
        list.add("Sergio");
        list.add("Martin");

        System.out.println("*********************Simple for method*********************");
        for (int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }

        System.out.println("*********************Simple for method********************");
        for (String str : list){
            System.out.println(str);
        }

        System.out.println("*******************Iterator*******************");

        Iterator<String> ltr=list.iterator();
        while (ltr.hasNext()){
            System.out.println(ltr.next());
        }

        System.out.println("***********ListIterator Direction *************");
        ListIterator<String>  listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("******************ListIterator Reverse Traversal *********");
        ListIterator<String> listIterator1=list.listIterator(list.size());
        while (listIterator1.hasPrevious()){
            System.out.println(listIterator1.previous());
        }

        System.out.println("**********************");
        list.forEach((element)->{
            System.out.println(element);
        });


        System.out.println("\n Terminated Successfully");
    }
}
