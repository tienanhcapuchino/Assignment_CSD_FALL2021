
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
                
                br += "|";
                String[] d = new String[5];
                String sub;
                int indexChar = 0;
                int indexArr = 0;
                while (indexArr < 5)
                {
                	indexChar = br.indexOf('|');
                	sub = br.substring(0, indexChar);
                	d[indexArr++] = sub;
                	if (indexChar + 1 < br.length()) 
                		br = br.substring(indexChar + 1);
                }
                Product p = new Product(d[0], d[1], Integer.parseInt(d[2]), Integer.parseInt(d[3]), Double.parseDouble(d[4]));
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
                
                br += "|";
                String[] d = new String[5];
                String sub;
                int indexChar = 0;
                int indexArr = 0;
                while (indexArr < 5)
                {
                	indexChar = br.indexOf('|');
                	sub = br.substring(0, indexChar);
                	d[indexArr++] = sub;
                	if (indexChar + 1 < br.length()) 
                		br = br.substring(indexChar + 1);
                }
                Customer c = new Customer(d[0], d[1], d[3]);
                cusl.addToTail(c);
			}
		} catch (FileNotFoundException | NumberFormatException e) {
		}
    }



    public void saveToFileProduct(String path) {
        try {
            File f = new File(path);
            if (f.exists()) {
                f.delete();
            }
            f.createNewFile();
            BufferedWriter fw = new BufferedWriter(new FileWriter(f));
            Node<Product> n = prol.head;
            while (n != null) {
                fw.write(n.getInfo().write() + "\n");
            }
            fw.close();
        } catch (Exception e) {
        }
    }

    public void saveToFileCustomer(String path) {
        try {
            File f = new File(path);
            if (f.exists()) {
                f.delete();
            }
            f.createNewFile();
            BufferedWriter fw = new BufferedWriter(new FileWriter(f));
            Node<Customer> n = cusl.head;
            while (n != null) {
                fw.write(n.getInfo().write() + "\n");
            }
            fw.close();
        } catch (Exception e) {
        }
    }
}
