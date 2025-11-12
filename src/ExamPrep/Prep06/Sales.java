package ExamPrep.Prep06;

public class Sales {
    private String productName;
    private int quantity;
    private double price;

    public Sales(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Product Name: " + productName + ", Quantity: " + quantity + ", Price: " + price;
    }

}
