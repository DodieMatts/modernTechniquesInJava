public class CreditCard {
    Money balance;
    Money creditLimit;
    Person owner;

    public CreditCard(Person newCardHolder, Money creditLimit){
        this.balance = new Money(0);
        this.creditLimit = new Money(creditLimit);
        this.owner = owner;
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }

    public String getPersonals(){
        return owner.toString();
    }

    public void charge(Money copyMoney) {
        if(copyMoney.compareTo(this.creditLimit)<0){
            System.out.println("Amount is greater than credit limit ");
        } else {
            this.balance.add(copyMoney);
        }
    }

    public void payment(Money copyMoney){
        this.balance.subtract(copyMoney);
    }
}
