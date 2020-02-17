package entities;

public class Student {
	
	public String name;
	public double quarter1;
	public double quarter2;
	public double quarter3;
	
	public double finalGrade() {
		return quarter1 + quarter2 + quarter3;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.00) {
			return 60.00 - finalGrade();
		}
		else {
			return 0.00;
		}
	}

}