import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date=new Date();
        System.out.println(String.valueOf(date.getTime()));

        JFrame frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420,420);
        frame.setVisible(true);



        System.out.println("Hello world!");
    }
}