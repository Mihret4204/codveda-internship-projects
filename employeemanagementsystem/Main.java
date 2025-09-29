package level2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpolyeeMng empMng = new EmpolyeeMng();

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Find Employee by ID");
            System.out.println("4. List All Employees");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Employee newEmp = new Employee(name, salary, department, position, id);
                    empMng.addEmployee(newEmp);
                    System.out.println("Employee added.");
                    break;
                case 2:
                    System.out.print("Enter ID of employee to remove: ");
                    int removeId = scanner.nextInt();
                    empMng.removeEmployee(removeId);
                    System.out.println("Employee removed if existed.");
                    break;
                case 3:
                    System.out.print("Enter ID of employee to find: ");
                    int findId = scanner.nextInt();
                    Employee foundEmp = empMng.findEmployeeById(findId);
                    if (foundEmp != null) {
                        System.out.println("Found: " + foundEmp);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.println("All Employees:");
                    for (Employee emp : empMng.getAllEmployees()) {
                        System.out.println(emp);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            
            }
        }
    }
}