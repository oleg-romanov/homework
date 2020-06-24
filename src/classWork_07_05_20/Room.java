package classWork_07_05_20;

import java.util.StringTokenizer;

public class Room {
    private String name;
    private int id;

    public Room(String roomLine){
        StringTokenizer st = new StringTokenizer(roomLine);
        this.name=st.nextToken();
        this.id = Integer.parseInt(st.nextToken());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}

