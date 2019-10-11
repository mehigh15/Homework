package assignment2;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;


@Getter
@Setter
@EqualsAndHashCode


public class Package implements Serializable {


     private String targetLocation;
     private int targetDistance;
     private int packageValue;
     private String deliveryDate;

    public Package(String targetLocation, int targetDistance, int packageValue, String deliveryDate){
        this.targetLocation = targetLocation.trim();
        this.targetDistance = targetDistance;
        this.packageValue = packageValue;
        this.deliveryDate = deliveryDate.trim();
    }

    @Override
    public String toString(){
        return "Target Location:" + targetLocation + "  "+ "Target Distance:" + targetDistance + "  " +"Package Value:" + packageValue +"  "+ "Delivery Date:" + deliveryDate;
    }

}
