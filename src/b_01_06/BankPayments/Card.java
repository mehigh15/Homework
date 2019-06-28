package b_01_06.BankPayments;

public class Card {
    private int expirationDate;
    private String ownerName;
    private String cardNumber;


    public Card(int expirationDate, String ownerName, String cardNumber) {
        setExpirationDate(expirationDate);
        setOwnerName(ownerName);
        setCardNumber(cardNumber);
    }


    public void setExpirationDate(int expirationDate){
        this.expirationDate=expirationDate;

    }

    public int getExpirationDate(){
        return expirationDate;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setCardNumber( String cardNumber){
        this.cardNumber = cardNumber;
    }

    public String getCardNumber(){
        return cardNumber;
    }


}