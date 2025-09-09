package Exceptions;

import java.util.*;

public class EmployeeserviceImpl implements IEmployee {
    private List<Employee> employees;

    public EmployeeserviceImpl() {
        employees = new ArrayList<>();
        employees.add(new Employee("admin", "admin123"));
        employees.add(new Employee("john", "john123"));
        employees.add(new Employee("alice", "alice123"));
    }

    @Override
    public String login(String username, String password) throws UserNotFoundException {
        for (Employee emp : employees) {
            if (emp.getUsername().equals(username)) {
                if (emp.getPassword().equals(password)) {
                    return "Login successful for user: " + username;
                } else {
                    throw new UserNotFoundException("Invalid password.");
                }
            }
        }
        throw new UserNotFoundException("Username does not exist.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        EmployeeserviceImpl service = new EmployeeserviceImpl();
        try {
            String result = service.login(username, password);
            System.out.println(result);
        } catch (UserNotFoundException e) {
            System.out.println("Login Failed: " + e.getMessage());
        }
    }
}
