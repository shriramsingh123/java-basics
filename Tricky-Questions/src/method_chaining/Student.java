package method_chaining;

public class Student {

    private int roll;
    private String name;
    private String subject;
    private String mobile_no;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public Student setRoll(int roll) {
        this.roll = roll;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Student setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
        return this;
    }


    public static Student of(){
        return new Student();
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                '}';
    }
}
