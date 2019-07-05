package c_29_06;

import java.util.ArrayList;
import java.util.List;

public class TesterClass  {
    List<Phone> phones = new ArrayList<>();


    public void listContacts(){
        for(Phone phone:phones){
            System.out.println(phone);
        }
    }
    public void addContact(Phone phone){
        phones.add(phone);
    }


    public static void main(String[]args){
        TesterClass phone = new TesterClass();
        Phone phone1 = new Phone("0742092451","Mihai","Eugen");
        phone.addContact(new Iphone("0742092457","Mihai","Arsene"));
        phone.addContact(new Iphone("0231312427","Ionut","Ionescu"));
        phone.listContacts();
        phone1.sendMessage("0742092412","" );

    }


}
