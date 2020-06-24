package ClassWork_20_05_20;

@StoreInFile(name="Room.txt")

public class Room {
    @MyField(name = "id")
    private int id;
    @MyField(name = "name")
    private String name;
    public Room(){
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

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

