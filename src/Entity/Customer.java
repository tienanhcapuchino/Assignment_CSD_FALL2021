

package Entity;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private String ccode;
    private String cus_name;
    private String phone;
    private MyList<Customer> cusList = new MyList<>();

    public Customer() {
    }

    public Customer(String ccode, String cus_name, String phone) {
        this.ccode = ccode;
        this.cus_name = cus_name;
        this.phone = phone;
    }
    
    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public MyList<Customer> getCusList() {
        return cusList;
    }

    public void setCusList(MyList<Customer> cusList) {
        this.cusList = cusList;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "ccode=" + ccode + ", cus_name=" + cus_name + ", phone=" + phone + ", cusList=" + cusList + '}';
    }
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.ccode);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.ccode, other.ccode)){
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Customer t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
