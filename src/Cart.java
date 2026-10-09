class Cart implements HotelService {
    @Override
    public String getServiceName() {
        return "Cart Service";
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("[Cart] " + numberOfCarts + " luggage cart(s) dispatched to the guest.");
    }
}
