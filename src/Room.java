/**
 * Created by Laboni Pc on 9/18/2015.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private boolean status;
    public Room()
    {

    }
    public Room(String hallName,int roomNo)
    {
        this.hallName=hallName;
        this.roomNo=roomNo;
        status=false;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getHallName() {
        return hallName;
    }

    public boolean getStatus() {
        return status;
    }
    public void setHallName(String hallName)
    {
        this.hallName=hallName;
    }
    public void setRoomNo(int roomNo)
    {
        this.roomNo=roomNo;
    }
    public void setStatus(boolean status)
    {
        this.status=status;
    }
    public void print()
    {
        if(status==false)
            System.out.println("Room No,"+"  "+this.roomNo+" "+"of "+" "+this.hallName+" "+"is currently available for allotment.");
        else
            System.out.println("Room No,"+"  "+this.roomNo+" "+"of"+" "+this.hallName+" "+"is currently alloted.");

    }
}
