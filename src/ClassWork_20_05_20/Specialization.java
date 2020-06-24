package ClassWork_20_05_20;

import java.util.StringTokenizer;
@StoreInFile(name = "Specialization.txt")
public class Specialization {
    @MyField(name = "specialization")
    private String specialization;
    @MyField(name = "id")
    private int id;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Specialization(String specializationLine){
        StringTokenizer st = new StringTokenizer(specializationLine);
        this.specialization=st.nextToken();
        this.id = Integer.parseInt(st.nextToken());

    }

    public Specialization() {}

    @Override
    public String toString() {
        return "Specialization{" +
                "specialization='" + specialization + '\'' +
                ", id=" + id +
                '}';
    }
}
