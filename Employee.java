

public class Employee {

     private String name;
     private int age;
     private double salary;
     private String department;

     public Employee(String name, int age, double salary, String department){
         this.name = name;
         this.age = age;
         this.salary = salary;
         this.department = department;

     }

     @Override
     public String toString() {
        return "Employee {"
            + "Name = " + name
            + ", age = " + age
            + ", salary = " + salary
            + ", department = " + department
            + '}';
     }

     


    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return double return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return String return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

}
