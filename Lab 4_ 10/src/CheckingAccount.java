
public class CheckingAccount extends BankAccount {

    private static double Fee = 0.15;
    private String AccountNumber;


//Initializing CheckingAccount Constructor taken from Super Class
    public CheckingAccount (String fullName, double initialAmmount){
        super(fullName, initialAmmount);
        AccountNumber = super.getAccountNumber() + "-" + "10";
    }

    //Returns accountNumber for the Checking Account class
    public String getAccountNumber() {
        return AccountNumber;
    }


@Override
//OverRide withdraw method to add fee to amount
    public boolean withdraw (double ammount) {
        ammount += Fee;

        return super.withdraw(ammount);
    }


}
