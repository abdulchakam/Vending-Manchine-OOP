package entity;

public class Food {

    private String type;

    private long price;

    private int stock;

    public Food() {
    }

    public Food(String type, long price, int stock) {
        this.type = type;
        this.price = price;
        this.stock = stock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
