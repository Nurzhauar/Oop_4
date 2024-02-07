public class CarDealershipMain {
    public static void main(String[] args) {
        CarDealership dealership = new CarDealership("Best Cars");

        Car car1 = new Car("Jac", 4, 25000, 6);
        Car car2 = new Car("Camry", 5, 22000, 10);

        PurchaseRequest request1 = new PurchaseRequest("Lana", "87751347575", car1);
        PurchaseRequest request2 = new PurchaseRequest("Nina", "87778096890", car2);
        PurchaseRequest request3 = new PurchaseRequest("Nuri", "87758094476", car2);
        PurchaseRequest request4 = new PurchaseRequest("Madiar", "87476543899", car2);

        car1.addPurchaseRequest(request1);
        car2.addPurchaseRequest(request2);
        car2.addPurchaseRequest(request3);
        car2.addPurchaseRequest(request4);

        dealership.addCar(car1);
        dealership.addCar(car2);

        Car foundCar = dealership.findCarByBrand("Jac");
        if (foundCar != null) {
            System.out.println("Car brand: " + foundCar.getBrandName());
            System.out.println("Available: " + foundCar.isAvailable());
            System.out.println("Number of purchase requests: " + foundCar.getPurchaseRequests().size());
        } else {
            System.out.println("Car not found.");
        }
    }
}
