public class Cart implements HotelService {
    
    public void requestCart(int numberOfCarts) {
        System.out.println("Cart service: Providing " + numberOfCarts + " luggage cart(s) to the guest.");
    }

    @Override
    public void executeService() {
        System.out.println("Executing Cart Service.");
    }
}
