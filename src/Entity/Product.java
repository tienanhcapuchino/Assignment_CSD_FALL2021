


package Entity;

import java.util.Objects;


public class Product implements Comparable<Product>{
    private String pcode;
    private String pro_name;
    private int quantity;
    private int sold;
    private double price;

    private MyList<Product> productList = new MyList<>();

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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.pcode, other.pcode)) {
            return false;
        }
        return true;
    }
    public void displayData() {
        Product product = new Product();
        Node<Product> p = productList.getObject(0);
        while (p != null) {
            product = p.getInfo();
            System.out.print(product.getPcode() + " | " + product.getPro_name() + " | " + product.getQuantity() + " | "
                    + product.getSold() + " | " + product.getPrice() + " | " + product.getPrice() * product.getSold());
            p = p.getNext();
        }
    }   
    public String write() {
        return getPcode() + " | " + getPro_name() + " | " + getQuantity() + " | "
        + getSold() + " | " + getPrice();
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.pcode);
        return hash;
    }
    
    @Override
    public int compareTo(Product t) {
        return t.getPcode().compareTo(pcode);
    }
}