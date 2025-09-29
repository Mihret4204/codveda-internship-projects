package level2;
import java.util.ArrayList;
import java.util.List;
public class EmpolyeeMng {
    private List<Employee> employees;

    public EmpolyeeMng() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
    }

    public Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
    
    
}