public class Valet implements HotelService {
    
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet service: Retrieving vehicle with plate number " + plateNumber + ".");
    }

    @Override
    public void executeService() {
        System.out.println("Executing Valet Service.");
    }
}
