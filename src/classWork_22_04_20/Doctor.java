package SecondLesson;

import SecondTask.MyField;
import SecondTask.StoreInFile;

import java.util.StringTokenizer;

@StoreInFile(name = "Doctors.txt")
public class Doctor {
    @MyField(name = "id")
   private int id;
   @MyField(name = "surname")
    private String surname;
   @MyField(name = "name")
   private  String name;
   @MyField(name = "patronymic")
   private String patronymic;
   @MyField(name = "specs_id")
private int specializationId;

public Doctor(String doctorLine) {
    StringTokenizer st = new StringTokenizer(doctorLine);
    this.id = Integer.parseInt(st.nextToken());
    this.surname = st.nextToken();
    this.name = st.nextToken();
    this.patronymic = st.nextToken();
this.specializationId = Integer.parseInt(st.nextToken());
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(int specializationId) {
        this.specializationId = specializationId;
    }
}
