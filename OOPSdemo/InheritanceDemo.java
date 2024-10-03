
class Person {

	int id;
	String name;

	
	void setPerson(int id, String name)
	{
		try {
			this.id = id;
			this.name = name;
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	void showPerson()
	{
		System.out.println("ID: "+id + "\n" +"Name: "+ name);
	}
}


class Employee extends Person {
	int salary;
	String designation;
	void setEmployee(int id, String name, String designation, int salary)
	{
			setPerson(id, name);
			this.designation = designation;
			this.salary = salary;
	}
	void showEmployee()
	{
		showPerson();
		System.out.println("Designation: " + designation + "\n" + "Salary: " + salary);
	}

}
public class InheritanceDemo{
	public static void main(String args[])
	{

		Employee e1 = new Employee();
		e1.setEmployee(101, "Akash", "Software Engineer", 75000);
		e1.showEmployee();
	}
}	

