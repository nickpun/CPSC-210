package ca.ubc.cs.cpsc210.management;


/**
 * Represents a department at a software development
 * company that has an arbitrary number of employees.
 */
public class Department {

	
	/**
	 * Constructor
	 * 		Department has given name and no employees
	 * 
	 * @param name  the name of the department
	 */
	public Department(String name) {
		// stub
	}
	
	/**
	 * Add an employee (no duplicates allowed) and set the
	 * employee's department to this department.
	 * 
	 * @param e   the employee to add to this department
	 */
	public void addEmployee(Employee e) {
		// stub	
	}
	
	/**
	 * If the department contains the specified employee, remove the employee 
	 * and disassociate employee with department.
	 * @param e  the employee to be removed from department
	 */
	public void removeEmployee(Employee e) {
		// stub
	}	
	
	/**
	 * Does department have a particular employee?
	 * @param e   employee to search for
	 * @return    true if dept has an employee with ID e.getEmployeeID()
	 */
	public boolean contains(Employee e) {
		return false;  // stub
	}
	
	public String getName() {
		return null;  // stub
	}
	
	/**
	 * Get number of employees in this department
	 * @return  number of employees
	 */
	public int getNumEmployees() {
		return 0;  // stub
	}
}
