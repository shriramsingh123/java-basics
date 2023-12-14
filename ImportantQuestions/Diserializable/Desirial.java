import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Desirial {
    
    public static void main(String[] args) {
        try{

            FileInputStream fileInputStream = new FileInputStream("ob.txt");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            System.out.println(ois.readObject());
            System.out.println(ois.getClass());
            ois.close();
            fileInputStream.close();

        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        System.out.println("Terminated successfully");
    }
}
