package atm;

import java.util.ArrayList;

public class DatabaseDataSource {

    public ArrayList<Customer> getCustomerData(){
        // database จำลอง
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"Andy","1234"));
        customers.add(new Customer(200,"Brian","2345"));
        return customers;

    }

}
