package ca.ubc.cs.cpsc210.management;

/**
 * An employee at a software development company.
 */
public class Employee {
	private Department department;

	private String name;
	private String employeeID;
	/**
	 * Constructor
	 * @param name         name of employee
	 * @param employeeID   ID of employee
	 */
	public Employee(String name, String employeeID) {
		this.name = name;
		this.employeeID = employeeID;
	}
	
	/**
	 * Sets department for this employee. Removes employee from previous
	 * department, if any. If department is not null, adds employee to department.  
	 * 
	 * @param d  department to which employee is to be added
	 */
	public void setDepartment(Department d) {
	    if (!(department == null)) {
            department.removeEmployee(this);
        }
		this.department = d;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setName(String name) {

	}
	
	public String getName() {
		return null;
	}
	
	public String getEmployeeID() {
		return null;
	}
}
