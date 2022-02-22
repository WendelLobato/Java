package entities;

public class _03_student {

	public String name;
	public double n1;
	public double n2;
	public double n3;

	public double Nota() {
		return n1 + n2 + n3;
	}

	public double PassorFailed() {
		if (Nota() <= 60) {
			return 60 - Nota();
		} else {
			return 0;
		}
	}
}
