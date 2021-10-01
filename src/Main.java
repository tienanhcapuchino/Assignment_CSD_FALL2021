
import Entity.*;
import java.util.*;
import Manager.*;


public class Main {

    public static void main(String[] args) {
        Product pro = new Product();
        Customer cus = new Customer();
        Orders ode = new Orders();
        
        Scanner sc = new Scanner(System.in);    
        int choice = 0;
        do {
            System.out.println("------Welcome to Tien Anh Capuchino 's Sale Managerment System------");
            System.out.println("Which services you want to choice: ");
            System.out.println("1. Customer");
            System.out.println("2. Product");
            System.out.println("3. Order");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    int choice01 = 0;
                    do{
                        System.out.println("1. Load data from file");
                        System.out.println("2. Input & add to the end");
                        System.out.println("3. Display data");
                        System.out.println("4. Save product list to file");
                        System.out.println("5. Search by pcode");
                        System.out.println("6. Delete by pcode");
                        System.out.println("7. Exit");
                        System.out.print("Your choice: ");
                        choice01 = sc.nextInt();
                        switch (choice01) {
                            case 1:
                                break;
                            case 2: 
                                break;
                            case 3: 
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                    } while(choice01 >= 1 && choice01 <= 6);
                    break;
                case 2:
                int choice02 = 0;
                do{
                    System.out.println("1. Load data from file");
                    System.out.println("2. Input & add to the end");
                    System.out.println("3. Display data");
                    System.out.println("4. Save customer list to file");
                    System.out.println("5. Search by pcode");
                    System.out.println("6. Delete by pcode");
                    System.out.println("7. Exit");
                    System.out.print("Your choice: ");
                    choice02 = sc.nextInt();
                    switch (choice02) {
                        case 1:
                            break;
                        case 2: 
                            break;
                        case 3: 
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                    }                    
                } while(choice02 >= 1 && choice02 <= 6);
                break;   
            case 3:
            int choice03 = 0;
            do{
                System.out.println("1. Input data");
                System.out.println("2. Display orders list");
                System.out.println("3. Sort the orders list by value");
                System.out.println("4. Exit");
                System.out.print("Your choice: ");
                choice03 = sc.nextInt();
                switch (choice03) {
                    case 1:
                        break;
                    case 2: 
                        break;
                    case 3: 
                        break;
                }
            } while(choice03 >= 1 && choice03 <= 3);
            break;             
            }
        } while (choice >= 1 && choice <= 3);
        System.out.println("THANKS TO USING MY SYSTEM!");
    }
    
}
