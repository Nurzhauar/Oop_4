import java.util.ArrayList;

public class Car {
    private String brandName;
    private int maxPassengers;
    private double cost;
    private int quantityInStock;
    private ArrayList<PurchaseRequest> purchaseRequests;

    public Car(String brandName, int maxPassengers, double cost, int quantityInStock) {
        this.brandName = brandName;
        this.maxPassengers = maxPassengers;
        this.cost = cost;
        this.quantityInStock = quantityInStock;
        this.purchaseRequests = new ArrayList<>();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public ArrayList<PurchaseRequest> getPurchaseRequests() {
        return purchaseRequests;
    }

    public void addPurchaseRequest(PurchaseRequest purchaseRequest) {
        purchaseRequests.add(purchaseRequest);
    }

    public void removePurchaseRequest(PurchaseRequest purchaseRequest) {
        purchaseRequests.remove(purchaseRequest);
    }

    public boolean isAvailable() {
        return quantityInStock > 0 && !purchaseRequests.isEmpty();
    }
}
