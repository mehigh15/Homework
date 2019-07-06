package c_29_06;

import java.util.Scanner;

public class Phone  {
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Phone(String phoneNumber,String firstName,String lastName){
        setPhoneNumber(phoneNumber);
        setFirstName(firstName);
        setLastName(lastName);
    }


    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }


    public void sendMessage(String phoneNumber, String messageContent){
        this.phoneNumber = phoneNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your message:");
        messageContent = scanner.nextLine();

        if (messageContent.length()>100){
            System.out.println("Your message should have a maximum of 100 characters");
        }else{
            System.out.println("Your message has been sent.");
        }

    }



    public String toString(){
        return getFirstName()+" "+getLastName()+" "+getPhoneNumber();
    }

}
