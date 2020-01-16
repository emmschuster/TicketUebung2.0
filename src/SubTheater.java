public class SubTheater implements Ticket{
		
		public SubTheater(String eventLocation, String eventName, double basicPrice) {
			setEventLocation(eventLocation);
			setEventName(eventName);
			setBasicPrice(basicPrice);
			calculateTicketPrice();
			ausgabe();
		}
		
		public SubTheater() {
			this("Event Location", "Event Name", 255);
		}
		
		private String verantstalungsort;
		
		public void setEventLocation(String eventLocation) {
			verantstalungsort=eventLocation;
		}
		
		public String getEventLocation() {
			return verantstalungsort;
		}
		
		private String verantsname;

		public void setEventName(String eventName) {
			verantsname=eventName;
		}
		public String getEventName() {
			return verantsname;
		}
		
		private double basisipreis;
		public void setBasicPrice(double basicPrice) {
			basisipreis=basicPrice;
		}
		public double getBasicPrice() {
			return basisipreis;
		}
		
		private double ticketpreis;
		private final int ANZTICKETS = 1000;
		private final double MWST=0.2;
		private final double SCHAUSPIELER=1500; 
		
		public void setTicketPrice(double ticketPrice) {
			ticketpreis=ticketPrice;
		}
		public double getTicketPrice() {
			return ticketpreis;
		}
		
		public void ausgabe() {
			System.out.println("Name der Veranstaltung : " + verantsname);
			System.out.println("Ort : " + verantstalungsort);
			System.out.println("Preis eines Tickets : " + getTicketPrice() +"EUR\n");
		}

		public void calculateTicketPrice() {
			ticketpreis = (Math.round(((SCHAUSPIELER+getBasicPrice())/ANZTICKETS)*MWST*100));
		}
	    

	
}
