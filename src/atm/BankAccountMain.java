package atm;

public class BankAccountMain {




    public static void main(String[] args) {
    BankAccount peter = new BankAccount(1,"Peter","Saving");
    BankAccount nancy = new BankAccount(2,"Nancy","Checking",1000);

    peter.deposit(500);
    nancy.withdraw(200);

        System.out.println(peter);
        System.out.println(nancy);

    }
}


