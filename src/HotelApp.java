public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("--- Guest Check-In & Services ---");
        frontDesk.requestCart(2);
        frontDesk.cleanRoom(405);

        System.out.println("\n--- Guest Check-Out & Services ---");
        frontDesk.pickUpVehicle("ABC-1234");
    }
}
