class HouseKeeping implements HotelService {
    @Override
    public String getServiceName() {
        return "Housekeeping Service";
    }

    public void cleanRoom(int roomNumber) {
        System.out.println("[HouseKeeping] Room number " + roomNumber + " has been scheduled for cleaning.");
    }
}
