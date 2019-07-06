package b_01_06.BankPayments;

public class User {
    private Card[] cards;
    private BankAccounts[] bankAccounts;


    public void setBankAccounts(BankAccounts[] bankAccounts){
        this.bankAccounts = bankAccounts;
    }

    public BankAccounts[] getBankAccounts() {
        return bankAccounts;
    }

    public void setCards(Card[] cards){
        this.cards = cards;
    }
    public Card[] getCards(){
        return cards;
    }

    public void addCard(){
      this.cards = new Card[2];
      cards[0]=new Card(2018,"John Smith","121121121");
      cards[1]=new Card(2019,"John Smith","121121122");

    }

    public void addBankAccount(){
     this.bankAccounts = new BankAccounts[2];
     bankAccounts[0]= new BankAccounts("RO0123");
     bankAccounts[1]= new BankAccounts("RO0124");
    }


public static void main(String[]args){
        User u = new User();
        u.addCard();
        u.addBankAccount();
}


}
