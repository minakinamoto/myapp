package atm;

import atm.Customer;

public class CustomerMain {

    public static void main(String[] args) {
        Customer peter = new Customer(1,"Peter","1234");
        Customer nancy = new Customer(2,"Nancy","2345");
        System.out.println(peter);
        System.out.println(nancy);
;    }

}
