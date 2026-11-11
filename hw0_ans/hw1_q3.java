import java.util.Scanner;

public class hw1_q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String eventNumber = input.next();
        int guests = input.nextInt();

        Event event = new Event(eventNumber, guests);

        System.out.println("Event Number: " + event.getEventNumber());
        System.out.println("Guests: " + event.getGuests());
        System.out.println("Total Price: $" + event.getPrice());
        System.out.println("Is Large: " + event.isLargeEvent());

        input.close();
    }
}

class Event {
    public static final int PRICE_PER_GUEST = 35;
    public static final int LARGE_EVENT_GUESTS = 50;

    private String eventNumber;
    private int guests;
    private int price;

    public Event(String eventNumber, int guests) {
        this.eventNumber = eventNumber;
        setGuests(guests);
    }

    public void setGuests(int guests) {
        this.guests = guests;
        this.price = guests * PRICE_PER_GUEST;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getGuests() {
        return guests;
    }

    public int getPrice() {
        return price;
    }

    public boolean isLargeEvent() {
        return guests >= LARGE_EVENT_GUESTS;
    }
}