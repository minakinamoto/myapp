package atm;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
//    private WebServiceDatasource dataSource;
//    private DatabaseDataSource dataSource;
    private  DataSource dataSource;

    public Bank(String name, DataSource dataSource) {
        this.name = name;
       // this.customers = new ArrayList<>();
//        this.dataSource = new DatabaseDataSource();
        this.dataSource = dataSource;
        this.customers = dataSource.getCustomerData();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public Customer findCustomer(int id) {
        // Customer result = null;
        // for pattern another >> (data with type : lists)
        for (Customer element : customers) {
            if (element.getId() == id)
                return element;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                ", dataSource=" + dataSource +
                '}';
    }
}




