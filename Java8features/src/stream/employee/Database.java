package stream.employee;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees(){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"Martin",Department.HR,25000));
        employees.add(new Employee(2,"Roy",Department.DEVELOPER,50000));
        employees.add(new Employee(3,"Kate",Department.DEVOPS,75000));
        employees.add(new Employee(4,"Jessica",Department.MANAGERIAL,100000));
        employees.add(new Employee(5,"Jandy",Department.TESTER,100000));
        employees.add(new Employee(6,"Andres",Department.DEVELOPER,250000));
        return employees;
    }
}
