
package Manager;

import Entity.*;
import java.io.*;
import java.util.Scanner;

public class menuManager {
    public static MyList<Product> prol = new MyList<>();
    public MyList<Customer> cusl = new MyList<>();
    public MyList<Orders> ordl = new MyList<>();

    public void loadFromProduct(String path) {
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String br = sc.nextLine().replaceAll("\\s+", "");
                String[] d = br.split("|");
                Product p = new Product(d[0], d[1], Integer.parseInt(d[2]), Integer.parseInt(d[3]),
                        Double.parseDouble(d[4]));
                prol.addToTail(p);
            }
        } catch (FileNotFoundException | NumberFormatException e) {
        }
    }

    public void loadFromCustomer(String path) {
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String br = sc.nextLine().replaceAll("\\s+", "");
                String[] d = br.split("|");
                Customer c = new Customer(d[0], d[1], d[2]);
                cusl.addToTail(c);
            }
        } catch (FileNotFoundException | NumberFormatException e) {
        }
    }

    public void displayData() {
        Product product = new Product();
        Node<Product> p = prol.getObject(0);
        while (p != null) {
            product = p.getInfo();
            System.out.print(product.getPcode() + " | " + product.getPro_name() + " | " + product.getQuantity() + " | " + product.getSold() + " | " + product.getPrice() + " | " + product.getPrice() * product.getSold());
            p = p.getNext();
        }
    }
}
