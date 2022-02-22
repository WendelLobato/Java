package entities;

public class _02_funcionario {

	public String name;
	public double grossSalary;
	public int tax;
	
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	
	public String toString() {
		return "Name: " + name +
				"  Gross salary: $ " + grossSalary +
				"  Tax: " + tax;
	}
	
}
