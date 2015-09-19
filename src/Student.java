/**
 * Created by Laboni Pc on 9/18/2015.
 */
public class Student {
    private String studentName;
    private String studentNo;
    private Room room;
    public Student()
    {

    }
    public Student(String studentName,String studentNo,Room room)
    {
        this.studentName=studentName;
        this.studentNo=studentNo;
        this.room=room;
    }

    public Room getRoom() {
        return room;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
    public void print()
    {
        System.out.println("Student No: "+this.studentNo+" ,"+this.studentName+" ,resides on"+" "+room.getHallName()+",Room no,"+room.getRoomNo());
    }
}
