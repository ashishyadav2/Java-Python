package Temp.pra2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Room {
    String rType;
    int pricePN;
    int nBooked;

    public Room(String rType,int pricePN, int nBooked){
        this.rType = rType;
        this.pricePN = pricePN;
        this.nBooked = nBooked;
    }
    public int roomRevenue(){
        return  this.pricePN*this.nBooked;
    }
}
class Hotel {
    int hId;
    String hName;
    ArrayList<Room> rooms;

    public Hotel(int hId, String hName, ArrayList<Room> rooms) {
        this.hId = hId;
        this.hName = hName;
        this.rooms = rooms;
    }
    public int hotelRevenue(){
        int sum = 0;
        for(Room r: rooms){
            sum += r.roomRevenue();
        }
        return sum;
    }
}
class BM{
    public Hotel maxRevenue(ArrayList<Hotel> arr){
        int max = -1;
        Hotel ans = null;
        String name = "";
        for(Hotel h: arr){
            if(h.hotelRevenue()>max){
                max = h.hotelRevenue();
                ans = h;
                name = h.hName;
            }
        }
        return ans;
    }
}
public class Practice1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\ashis\\IdeaProjects\\JavaLessons\\src\\Temp\\pra2\\input3.txt";
        File fileObj = new File(path);
        Scanner sc = new Scanner(fileObj);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Hotel> arr = new ArrayList<>();
        for(int i =0;i<n;i++){
            int id = Integer.parseInt(sc.nextLine().trim());
            String name = sc.nextLine();
            int nRooms = Integer.parseInt(sc.nextLine().trim());
            ArrayList<Room> rooms = new ArrayList<>();
            for( int j=0;j<nRooms;j++){
                String rName = sc.nextLine();
                int pricePN = Integer.parseInt(sc.nextLine().trim());
                int nBooked = Integer.parseInt(sc.nextLine().trim());
                rooms.add(new Room(rName,pricePN,nBooked));
            }
            arr.add(new Hotel(id,name,rooms));
        }
        for(int k=0;k<arr.size();k++){
            System.out.printf("Total Revenue for Hotel Paradise: %d%n",arr.get(k).hotelRevenue());
        }
        BM obj  = new BM();
        System.out.printf("The hotel with the highest revenue is: %s",obj.maxRevenue(arr).hName);
    }
}
