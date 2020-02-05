public class Error_notImIntervall extends Exception {
	public Error_notImIntervall(int x, int y) {
		System.out.println("Die Zahl ist nicht im Vorgegebenen Intervall von "+x+" und "+y);
	}
	public Error_notImIntervall(String msg) {
		super(msg);
	}
}
