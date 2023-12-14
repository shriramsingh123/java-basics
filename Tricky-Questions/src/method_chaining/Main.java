package method_chaining;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        //student.setName("Andres Estwan").setRoll(25).setSubject("B.S.C").setMobile_no("2737643723");
        Student student1 =
                Student.of()
                        .setName("Andres Estwan")
                        .setRoll(25)
                        .setSubject("B.S.C")
                        .setMobile_no("2737643723");

        System.out.println(student1);

        System.out.println("\n Terminated Successfully ");
    }
}
