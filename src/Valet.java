class Valet implements HotelService {
    @Override
    public String getServiceName() {
        return "Valet Service";
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("[Valet] Vehicle with plate number " + plateNumber + " has been requested and is on the way.");
    }
}
