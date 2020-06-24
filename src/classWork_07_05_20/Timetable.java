package classWork_07_05_20;

import java.util.StringTokenizer;

public class Timetable {
    private String time;
    private int doctorId;
    private int roomId;

    public Timetable(String timetableLine){
        StringTokenizer st = new StringTokenizer(timetableLine);
        this.time=st.nextToken();
        this.doctorId = Integer.parseInt(st.nextToken());
        this.roomId = Integer.parseInt(st.nextToken());
    }

    public String getTime() {
        return time;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
