
public class Product {
    private String pcode;
    private String pro_name;
    private int quantity;
    private int sold;
    private double price;

    public Product() {
    }

    public Product(String pcode, String pro_name, int quantity, int sold, double price) {
        this.pcode = pcode;
        this.pro_name = pro_name;
        this.quantity = quantity;
        this.sold = sold;
        this.price = price;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "pcode=" + pcode + ", pro_name=" + pro_name + ", quantity=" + quantity + ", sold=" + sold + ", price=" + price + '}';
    }
    
}
