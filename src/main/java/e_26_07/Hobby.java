package e_26_07;

import e_26_07.Address;

import java.util.List;

public class Hobby {
    private String nameOfHobby;
    private int frequency;
    private List<Address> addressList;


    public Hobby(String nameOfHobby, int frequency, List<Address> addressList) {
        setNameOfHobby(nameOfHobby);
        setFrequency(frequency);
        setList(addressList);
    }

    public void setNameOfHobby(String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setList(List<Address> addressListlist) {
        this.addressList = addressListlist;
    }

    public List<Address> getList() {
        return addressList;
    }

    @Override
    public String toString(){
        return nameOfHobby + " " + frequency + " "+ addressList;
    }

}
