package Temp;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.print.DocFlavor.STRING;

class Bus {
    private int busId;
    private String busName;
    private double fare;
    private String busSeatType;
    private String acType;

    Bus(int busId, String busName, double fare, String busSeatType, String acType) {
        this.busId = busId;
        this.busName = busName;
        this.fare = fare;
        this.busSeatType = busSeatType;
        this.acType = acType;
    }

    void setBusId(int busId) {
        this.busId = busId;
    }

    void setBusName(String busName) {
        this.busName = busName;
    }

    void setFare(double fare) {
        this.fare = fare;
    }

    void setBusSeatType(String busSeatType) {
        this.busSeatType = busSeatType;
    }

    void setAcType(String acType) {
        this.acType = acType;
    }

    int getBusId() {
        return this.busId;
    }

    String getBusName() {
        return this.busName;
    }

    double getFare() {
        return this.fare;
    }

    String getBusSeatType() {
        return this.busSeatType;
    }

    String getAcType() {
        return this.acType;
    }

    @Override
    public String toString() {
        return "{ " +
                this.getBusId() + ", " +
                this.getBusName() + ", " +
                this.getFare() + ", " +
                this.getBusSeatType() + ", " +
                this.getAcType() + " }";
    }
}
class BusTicketBooking {
    static Bus[] discountOffer(Bus[] array, String busName, double discountPercentage) {
        int i=0;
        for (Bus currBus : array) {
            if (currBus.getBusName().equalsIgnoreCase(busName) &&
                    currBus.getBusSeatType().equalsIgnoreCase("seater") &&
                    currBus.getAcType().equalsIgnoreCase("ac")) {
                double newFare = currBus.getFare() - (currBus.getFare() * (discountPercentage / 100));
                currBus.setFare(newFare);
            }
            else{
                array[i] = null;
            }
            i++;
        }
        return array;
    }
}

public class Solution {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numberOfBuses = sc.nextInt();
        Bus[] busArray = new Bus[numberOfBuses];
        int arrIndex = 0;
        System.out.println();
        for(int i=0;i<numberOfBuses;i++) {
            int busId = sc.nextInt();
            String busName= sc.next();
            double fare = sc.nextDouble();
            String busSeatType = sc.next();
            String acType = sc.next();
            System.out.println(busId+" "+busName+" "+fare+" "+busSeatType+" "+acType);
            Bus busObj = new Bus(busId, busName, fare, acType, busSeatType);
            busArray[arrIndex] = busObj;
            arrIndex++;
        }

        String busName = sc.next();
        double discountPercentage = sc.nextDouble();
        sc.close();

        System.out.println("BusName: "+busName);
        System.out.println("Discount: "+discountPercentage);

         Bus[] ans = BusTicketBooking.discountOffer(busArray, busName, discountPercentage);
         int size = 0;
         for(Bus elem: ans){
             if(elem!=null){
                 size++;
             }
         }
        System.out.println();
         System.out.println("No of "+busName+" AC-Seater Bus found: "+size);
         for(Bus currBus: ans){
             if(currBus!=null) {
                 System.out.println("BusId: "+currBus.getBusId());
                 System.out.println("New Fare: "+currBus.getFare());
             }
         }
         }
}