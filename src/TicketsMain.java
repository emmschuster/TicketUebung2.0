import java.util.Scanner;

public class TicketsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicketBasis shop = new TicketBasis();
		System.out.println("Welche Art von Tickets soll angezeigt werden? \n1=Konzert\t2=Sport\t3=Theater\t4=Alle");
		int antwort = sc.nextInt();
		switch (antwort) {
		case 1:
			SubKonzert k1 = new SubKonzert("Muenchen", "PapaRoach ft BodyCout", 100);
			SubKonzert k2 = new SubKonzert("Arena Wien");
			SubKonzert k3 = new SubKonzert("Olympiahalle Muenchen", "Sabaton");
			shop.bestellen(k1);
			shop.bestellen(k2);
			shop.bestellen(k3);
			System.out.println("Anz Tickets zum auswählen " + shop.getAnz());
			System.out.println("\nguenstigstes ticket:");
			shop.getGunstigstes();
			System.out.println("teuerstes ticket:");
			shop.getTeuerstes();
			break;
		case 2:
			SubSport s1 = new SubSport("Innsbruck", "Weltmeisterschaft", 150);
			shop.bestellen(s1);
			System.out.println("Anz Tickets zum auswählen " + shop.getAnz());
			System.out.println("\nguenstigstes ticket:");
			shop.getGunstigstes();
			System.out.println("teuerstes ticket:");
			shop.getTeuerstes();
			break;
		case 3:
			SubTheater t1 = new SubTheater("Kammerspiele", "Ritter der Kokosnuss", 200);
			SubTheater t2 = new SubTheater();
			shop.bestellen(t1);
			shop.bestellen(t2);
			System.out.println("Anz Tickets zum auswählen " + shop.getAnz());
			System.out.println("\nguenstigstes ticket:");
			shop.getGunstigstes();
			System.out.println("teuerstes ticket:");
			shop.getTeuerstes();
			break;
		case 4:
			SubKonzert k11 = new SubKonzert("Muenchen", "PapaRoach ft BodyCout", 100);
			SubKonzert k22 = new SubKonzert("Arena Wien");
			SubKonzert k33 = new SubKonzert("Olympiahalle Muenchen", "Sabaton");
			SubSport s11 = new SubSport("Innsbruck", "Weltmeisterschaft", 150);
			SubTheater t11 = new SubTheater("Kammerspiele", "Ritter der Kokosnuss", 200);
			SubTheater t22 = new SubTheater();
			shop.bestellen(k11);
			shop.bestellen(k22);
			shop.bestellen(k33);
			shop.bestellen(s11);
			shop.bestellen(t11);
			shop.bestellen(t22);
			System.out.println("Anz Tickets zum auswählen " + shop.getAnz());
			System.out.println("\nguenstigstes ticket:");
			shop.getGunstigstes();
			System.out.println("teuerstes ticket:");
			shop.getTeuerstes();
			break;
		}
		sc.close();
	}
}
