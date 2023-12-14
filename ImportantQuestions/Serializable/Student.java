import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private String email;
    private int age;
    private String address;

    public Student(){

    }
    public Student(String name,String email,int age,String address){
            this.name=name;
            this.email=email;
            this.age=age;
            this.address=address;
    }

    public String get_name(){
        return name;
    }
    public void set_name(String name){
        this.name=name;
    }

    public String get_email(){
        return email;
    }
    public void set_email(String email){
        this.email=email;
    }

     public int get_age(){
        return age;
    }
    public void set_age(int age){
        this.age=age;
    }

     public String get_address(){
        return address;
    }
    public void set_address(String address){
        this.address=address;
    }

}
