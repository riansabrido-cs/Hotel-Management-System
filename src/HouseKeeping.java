public class HouseKeeping implements HotelService {
    
    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping service: Cleaning room number " + roomNumber + ".");
    }

    @Override
    public void executeService() {
        System.out.println("Executing Housekeeping Service.");
    }
}
