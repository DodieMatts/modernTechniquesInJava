public class SavingsAccount extends BankAccount {

    private double rate = 2.5;
    private int savingsNumber = 0;
    private String AccountNumber;

    //SavingsAccount Constructor, Inherited from Super class
    public SavingsAccount(String name, double ammount) {
        super (name , ammount);
        AccountNumber = super.getAccountNumber() + "-" + savingsNumber;
        savingsNumber++;
    }

        //Method to calculate interest and add it to the balance
    public void postInterest () {
        double interest;
        double amount;

        interest = (rate/12)/100;
        amount = getBalance()*interest;

        deposit(amount);
    }

    /**
     * A copy constructor
     * @param savings
     * @param initialAmmount
     */
    public SavingsAccount (SavingsAccount savings, double initialAmmount){
        super(savings, initialAmmount);
        AccountNumber = super.getAccountNumber() + "-" + savingsNumber;
        savingsNumber++;

    }
//Getter account Number method
    public String getAccountNumber(){
        return AccountNumber;
    }


}
