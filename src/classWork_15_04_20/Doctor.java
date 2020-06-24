package classWork_15_04_20;

import java.util.StringTokenizer;

public class Doctor {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int specializationId;

    public Doctor(String doctorLine) {
        StringTokenizer st = new StringTokenizer(doctorLine);
        this.id = Integer.parseInt(st.nextToken());
        this.surname = st.nextToken();
        this.name = st.nextToken();
        this.patronymic = st.nextToken();
        this.specializationId = Integer.parseInt(st.nextToken());
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(int specializationId) {
        this.specializationId = specializationId;
    }
}
