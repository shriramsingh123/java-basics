import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {

        Student student=new Student("Andres","andres@gmail.com",123,"south wales");

        try{

            FileOutputStream fos=new FileOutputStream("ob.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);

            oos.writeObject(student);
            oos.close();
            fos.close();


        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }


        System.out.println("Successfully termainated");
    }
}
