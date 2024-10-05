package Revision.Encapsulation;

public class Addr {
    private int roomNo;
    String streetName;

    public Addr(int roomNo){
        setRoomNo(roomNo);
    }
    public Addr(int roomNo,String streetName){
        setRoomNo(roomNo);
        setStreetName(streetName);
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Addr{" +
                "roomNo=" + roomNo +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
