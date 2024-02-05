package list_taverse;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrent_collections {

    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("sixth");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");

        // thread 1
        Runnable t = ()->{
            for (String str : list){
                System.out.println(list);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // thread 2
        Runnable t2 = ()->{
            list.add("New item");
            list.add("New item");
            list.add("New item");
        };

        new Thread(t).start();
        new Thread(t2).start();


        System.out.println("\n Terminated Successfully");
    }
}
