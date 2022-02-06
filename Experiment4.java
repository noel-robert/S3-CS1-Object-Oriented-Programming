// Experiment 4 - Inheritance (Batch B)
class Employee
{
	String name, address;
	int age;
	long phone;
	float salary;

	Employee(String name, int age, long phone, String address, float salary)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}

	void print()
	{
		System.out.println("Name: "+name + "\nAge: "+age + "\nPhone: "+phone + "\nAddress: "+address);
	}

	void printSalary()
	{
		System.out.println("Salary: "+salary);
	}
}

class Officer extends Employee
{
	String specialization;

	Officer(String name, int age, long phone, String address, float salary, String specialization)
	{
		super(name, age, phone, address, salary);
		this.specialization = specialization;
	}

	void print()
	{
		super.print();
		System.out.println("Specialization: "+specialization);
		printSalary();
		System.out.println();
	}
}

class Manager extends Employee
{
	String department;

	Manager(String name, int age, long phone, String address, float salary, String department)
	{
		super(name, age, phone, address, salary);
		this.department = department;
	}

	void print()
	{
		super.print();
		System.out.println("Department: "+department);
		printSalary();
		System.out.println();
	}
}

public class Experiment4
{
	public static void main(String args[])
	{
		Officer ob1 = new Officer("John Reese", 49, 9406821058l, "B21 Street", 75000.00f, "Data Analytics");
		Manager ob2 = new Manager("Harold Finch", 54, 8430217598l, "F117 Street", 120000.00f, "Cyber Security");

		ob1.print();
		ob2.print();
	}
}