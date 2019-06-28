package b_01_06.BankPayments;

import b_01_06.BankPayments.BankAccounts;

public class Pos {

    private BankAccounts[] bankAccounts;

    public void setBankAccounts(BankAccounts[] bankAccounts){
        this.bankAccounts=bankAccounts;
    }
    public BankAccounts[] getBankAccounts(){
        return bankAccounts;
    }

    public void addKnownBankAccount(BankAccounts bankAccount){
     this.bankAccounts = new BankAccounts[2];
     bankAccounts[0] = new BankAccounts("RO0123");
     bankAccounts[1] = new BankAccounts("RO0124");
    }

    public void pay(int amount, String card){

    }
}

