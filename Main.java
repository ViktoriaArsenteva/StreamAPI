import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {
    
    public static void main(String[] args) {

        Task1.numsOperations();
        System.out.println();


        List<Employee> employees = EmployeeData.getEmployees();

        // Вывести список всех различных отделов (department) по списку сотрудников

        List<String> departments = employees.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());

        departments.forEach(n -> System.out.println(n));
        System.out.println();

        // Всем сотрудникам, чья зарплата меньше 10_000, повысить зарплату на 20%

        List<Employee> emp1 = employees.stream().map(empl -> empl.getSalary() < 10000 ? (new Employee(empl.getName(), empl.getAge(), empl.getSalary() * 1.2, empl.getDepartment())) : empl ).collect(Collectors.toList());

        emp1.forEach(n -> System.out.println(n));
        System.out.println();

        // Из списка сотрудников с помощью стрима создать Map<String, List<Employee>> с отделами и сотрудниками внутри отдела

        Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for(Map.Entry<String,List<Employee>> pair : map.entrySet())
        {
            String key = pair.getKey();
            List<Employee> value = pair.getValue();
            System.out.println(key + ": " + value + "\n");
            System.out.println();

        }

        // Из списока сорудников с помощью стрима создать Map<String, Double> с отделами и средней зарплатой внутри отдела

        
    }

}

