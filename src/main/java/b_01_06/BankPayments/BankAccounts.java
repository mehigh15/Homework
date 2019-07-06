package b_01_06.BankPayments;

public class BankAccounts {
    private String iban;
    private int balance;
    private String[] attachedCardNumbers;

    public BankAccounts(String iban){
        setIban(iban);
    }

  public void setIban(String iban){
        this.iban = iban;
  }
  public String getIban(){
        return iban;
  }
  public void setBalance(int balance){
        this.balance = balance;
  }
  public int getBalance(){
        return balance;
  }
  public void setAttachedCardNumbers(String[] attachedCardNumbers){
        this.attachedCardNumbers = attachedCardNumbers;
  }
  public String[] getAttachedCardNumbers(){
        return attachedCardNumbers;
  }

  public void addMoney(int amount){
    this.balance = this.balance + amount;
  }
  public void withdrawMoney(int amount){
    this.balance = this.balance - amount;
  }
  public void attachCard(String cardNumber){

  }
}
