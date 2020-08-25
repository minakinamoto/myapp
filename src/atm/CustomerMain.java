package atm;

import atm.Customer;

public class CustomerMain {

    public static void main(String[] args) {
        Customer peter = new Customer(1,"Peter","1234");
        Customer nancy = new Customer(2,"Nancy","2345");
//        System.out.println(peter);
//        System.out.println(nancy);
//        System.out.println(peter.checkPin("1234"));

        // can choose from DB or WS
            // DB
//        Bank bank = new Bank("My Bank",new DatabaseDataSource());
            // WS
        Bank bank = new Bank("My Bank",new WebServiceDatasource());
        bank.addCustomer(peter);
        bank.addCustomer(nancy);

        System.out.println(bank);
//        Customer c1 = bank.findCustomer(1);
//        Customer c80 = bank.findCustomer(80);
//        System.out.println(c1);
//        System.out.println(c80);

        ATM atm = new ATM(bank);
        atm.validateCustomer(1,"1234");
        atm.deposit(1000);
        System.out.println(peter);

        atm.transfer(2,200);
        System.out.println(peter);
        System.out.println(nancy);


;    }

}
