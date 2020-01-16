import java.util.ArrayList;

public class TicketBasis {
	ArrayList<Ticket> meineListe = new ArrayList<Ticket>();

	public void bestellen(Ticket x) {
		meineListe.add(x);
	}

	public int getAnz() {
		return meineListe.size();
	}

	public void getGunstigstes() {
		Ticket billigstes = meineListe.get(0);
		for (int i = 1; i < meineListe.size(); i++) { // mit 1 starten, weil wir mit einer vorherigen Karte vergleichen
			Ticket currentTicket = meineListe.get(i);
			double cheapestTicketPrice = billigstes.getTicketPrice();
			double currentTicketPrice = currentTicket.getTicketPrice();
			if (currentTicketPrice < cheapestTicketPrice) {
				billigstes = meineListe.get(i);
			}
		}
		billigstes.ausgabe();
	}

	public void getTeuerstes() {
		Ticket teuerstes = meineListe.get(0);
		for (int i = 1; i < meineListe.size(); i++) { // mit 1 starten, weil wir mit einer vorherigen Karte vergleichen
			Ticket currentTicket = meineListe.get(i);
			double cheapestTicketPrice = teuerstes.getTicketPrice();
			double currentTicketPrice = currentTicket.getTicketPrice();
			if (currentTicketPrice > cheapestTicketPrice) {
				teuerstes = meineListe.get(i);
			}
		}
		teuerstes.ausgabe();
	}
}