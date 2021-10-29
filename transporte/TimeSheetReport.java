package transporte;
import Employee;

public class TimeSheetReport {

	public void print(Employee employee) {
		System.out.println("Tiempos fuera "+ employee.getName());
		System.out.println("horas trabajadas ");
		System.out.println("vacacioners  ");
	}
}
