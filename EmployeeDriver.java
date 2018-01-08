//Author Peter Adamson

import java.util.*;

public class EmployeeDriver{

	public static void main(String[] args){

		char status = 'y';
		int tempSalary = 0;
		int tracker = 0;
		int salaryTracker = 0;
		double salaryAverage = 0;
		String tempName;
		Employee maxSalary = new Employee();
		Employee minSalary = new Employee();
		ArrayList<Employee> employees = new ArrayList<Employee>();
		ArrayList<Integer> salaries = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the name and salary for at least 5 employees:");

		while(tracker <5){
			System.out.printf("Please enter the name of employee #%d%n", tracker+1);
			tempName = sc.next();
			System.out.printf("Please enter the salary of employee #%d%n", tracker+1);
			tempSalary = sc.nextInt();
			salaries.add(tempSalary);
			employees.add(new Employee(tempName, tempSalary));
			tracker++;
		}

		System.out.println("Would you like to enter another employee? (y/n)");
		status = sc.next().charAt(0);
		
		while(status == 'y' || status == 'Y'){
			System.out.printf("Please enter the name of employee #%d%n", tracker+1);
			tempName = sc.next();
			System.out.printf("Please enter the salary of employee #%d%n", tracker+1);
			tempSalary = sc.nextInt();
			salaries.add(tempSalary);
			employees.add(new Employee(tempName, tempSalary));
			tracker++;
			System.out.println("Would you like to enter another employee? (y/n)");
			status = sc.next().charAt(0);
		}

		salaryTracker = Collections.max(salaries);
		salaryTracker = salaries.indexOf(salaryTracker);
		maxSalary = employees.get(salaryTracker);

		salaryTracker = Collections.min(salaries);
		salaryTracker = salaries.indexOf(salaryTracker);
		minSalary = employees.get(salaryTracker);

		for(int i = 0; i < salaries.size(); i++){
			salaryAverage += salaries.get(i);
		}

		salaryAverage = salaryAverage/salaries.size();

		System.out.printf("The highest paid employee is %s and their salary is $%.2f%n", maxSalary.getName(), maxSalary.getSalary());
		System.out.printf("The lowest paid employee is %s and their salary is $%.2f%n", minSalary.getName(), minSalary.getSalary());
		System.out.printf("The average salary is $%.2f%n", salaryAverage); 
		
	}
}
