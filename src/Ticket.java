public interface Ticket {
	
void calculateTicketPrice();
	
	public void setEventLocation(String eventLocation);
	public String getEventLocation();
	
	public void setEventName(String eventName);
	public String getEventName();
	
	public void setBasicPrice(double basicPrice);
	public double getBasicPrice();
	
	public void setTicketPrice(double ticketPrice);
	public double getTicketPrice();
	
	public void ausgabe();
}
