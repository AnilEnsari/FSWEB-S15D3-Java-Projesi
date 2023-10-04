package Company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Anil","Ensari") );
        employees.add(new Employee(2,"Mauro","Icardi") );
        employees.add(new Employee(3,"Fernando","Muslera") );
        employees.add(new Employee(4,"Wilfried","Zaha") );
        employees.add(new Employee(5,"Kerem","Aktürkoğlu") );
        employees.add(new Employee(6,"Okan","Buruk") );
        employees.add(new Employee(7,"Erden","Timur") );
        employees.add(new Employee(1,"Anil","Ensari") );
        employees.add(new Employee(2,"Mauro","Icardi") );
        employees.add(new Employee(4,"Wilfried","Zaha") );
        employees.add(new Employee(6,"Okan","Buruk") );
        Map<Integer, Employee> fixedEmployees = new HashMap<>();
        Map<Integer, Employee> cleanedEmployees = new HashMap<>();

        for ( Employee employee : employees){
if(fixedEmployees.containsKey(employee.getId())){
    cleanedEmployees.put(employee.getId(),employee);

}
       else {fixedEmployees.put(employee.getId(),employee);}
        }


        System.out.println("First Linked List : "+employees.size());
        System.out.println("fixedEmployees= "+fixedEmployees);
        System.out.println("Second HashMap: "+fixedEmployees.size());
        System.out.println(cleanedEmployees.size()+" cleanedEmployees= "+cleanedEmployees);

    }
}
