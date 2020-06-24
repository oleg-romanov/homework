package classWork_07_05_20;

import java.util.StringTokenizer;

public class Specialization {
    private String specialization;
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
}


