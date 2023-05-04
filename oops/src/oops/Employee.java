package oops;

public class Employee {
	
	private String name;
	private int employeeId;
	private double salary;
	
	public Employee(String name, int employeeId, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Priya", 1, 350000);
		Employee emp2 = new Employee("Rosi", 2, 300000);
		Employee emp3 = new Employee("Safa", 3, 150000);
		Employee emp4 = new Employee("Sweety", 4, 130000);
		
		Employee[] employees = {emp1, emp2, emp3, emp4};
		
		// Sort the employees by salary in descending order
		for (int i = 0; i < employees.length; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if(employees[i].getSalary() < employees[j].getSalary()) {
					Employee temp = employees[i];
					employees[i] = employees[j];
					employees[j] = temp;
				}
			}
		}
		
		System.out.println("Top 3 highest-paid employees:");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Name: " + employees[i].getName() + ", Employee ID: " + employees[i].getEmployeeId() + ", Salary: " + employees[i].getSalary());
		}
	}
	
}


