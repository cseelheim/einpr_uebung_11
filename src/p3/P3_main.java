package p3;

public class P3_main {

	public static void main(String[] args) {
		System.out.println("Zinsen für 1004€ nach einem Jahr: " + zinsen(1004, 1) + "€");

	}

	public static int zinsen(double kapital, int jahre) {
		if (jahre == 0)
			return (int) kapital;

		return (int) (1.05 * zinsen(kapital, jahre - 1));
	}

}
