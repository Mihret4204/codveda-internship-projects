package level2;

public class Employee {
    private String name;
    private double salary;
    private String department;
    private String position;
    private int id;

    public Employee(String name, double salary, String department, String position, int id) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.position = position;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    public String getPosition() {
        return position;
    }
    public int getId() {
        return id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
                + ", position=" + position + "]";
    }

    
    
}
