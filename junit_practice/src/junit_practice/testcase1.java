package junit_practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase1 {
	EmployeeDetails emp = new EmployeeDetails();
	EmpBusinessLogic ebl = new EmpBusinessLogic();
	
	@Test
	public void testcalculateAppraisal() {
		emp.setName("Rajeev");
		emp.setAge(25);
		emp.setMonthlySalary(8000);
		double appraisal = ebl.calculateAppraisal(emp);
		assertEquals(500, appraisal, 0.0);
	}
	
	@Test
	public void testcalculateYearlySalary(){
		emp.setName("Rajeev");
		emp.setAge(25);
		emp.setMonthlySalary(8000);
		double yearlySalary = ebl.calculateYearlySalary(emp);
		assertEquals(96000, yearlySalary, 0.0);
	}
}
