import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    private static List<Employee> employees = new ArrayList<Employee>();

    static {
        Employee emp1 = new Employee("Аркадий", 29, 100000, "Бухгалтерия");
        Employee emp2 = new Employee("Виктория", 56, 980000, "Юридический отдел");
        Employee emp3 = new Employee("Алексей", 18, 43000, "Отдел продаж");
        Employee emp4 = new Employee("Роза", 31, 1200, "Отдел продаж");
        Employee emp5 = new Employee("Анжелика", 43, 29000, "Отдел маркетинга");
        Employee emp6 = new Employee("Полина", 40, 150000, "Отдел кадров");
        Employee emp7 = new Employee("Марк", 25, 87000, "Отдел маркетинга");
        Employee emp8 = new Employee("Денис", 26, 450000, "Юридический отдел");
        Employee emp9 = new Employee("Констанстин", 19, 280000, "Бухгалтерия");
        Employee emp10 = new Employee("Олеся", 27, 21000, "Отдел кадров");
        Employee emp11 = new Employee("Мария", 67, 3400, "Отдел кадров");
        Employee emp12 = new Employee("Екатерина", 81, 15000, "Отдел маркетинга");
        Employee emp13 = new Employee("Ульяна", 34, 140000, "Юридический отдел");
        Employee emp14 = new Employee("Михаил", 23, 2390, "Бухгалтерия");
        Employee emp15 = new Employee("Павел", 48, 7300, "Отдел продаж");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);
        employees.add(emp10);
        employees.add(emp11);
        employees.add(emp12);
        employees.add(emp13);
        employees.add(emp14);
        employees.add(emp15);
    }

    public static List<Employee> getEmployees(){
        return employees;

    }
    
}
