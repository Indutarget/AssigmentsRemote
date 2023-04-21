class Emp
{
	String name;
	int age;
	int salary;
	public void display()
	{
	}
	public void raiseSalary()
	{
	}
}
class Tester extends Emp
{
	int salary=20000;	
	Tester(String name,int age)
	{
	this.name=name;
	this.age=age;
	}
	public void raiseSalary()
	{
	salary=salary+2000;
	}
	public void display()
	{
	System.out.println("Designation: Tester");
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Salary: "+salary);
	}

}
class Programmer extends Emp
{
	int salary=30000;
	Programmer(String name,int age)
	{
	this.name=name;
	this.age=age;
	}
	public void raiseSalary()
	{
	salary=salary+5000;
	}
	public void display()
	{
	System.out.println("Designation: Programmer");
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Salary: "+salary);
	}

}
class Manager extends Emp
{
	int salary=50000;
	Manager(String name,int age)
	{
	this.name=name;
	this.age=age;
	}
	public void raiseSalary()
	{
	salary=salary+10000;
	}
	public void display()
	{
	System.out.println("Designation: Manager");
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Salary: "+salary);
	}
}
public class EmpSalary
{
	public static void main(String args[])
	{
	Emp e1=new Tester("John",30);
	Emp e2=new Programmer("Ravi",34);
	Emp e3=new Manager("Mary",32);
	e1.display();
	System.out.println("-------------------------------");
	e2.display();
	System.out.println("-------------------------------");
	e3.display();
	System.out.println("-------------------------------");
	
	e1.raiseSalary();
	e2.raiseSalary();
	e3.raiseSalary();

	System.out.println("After Salary increment");
	System.out.println("`````````````````````````````````````");
	e1.display();
	System.out.println("-------------------------------");
	e2.display();
	System.out.println("-------------------------------");
	e3.display();
	System.out.println("-------------------------------");
	}
}
	