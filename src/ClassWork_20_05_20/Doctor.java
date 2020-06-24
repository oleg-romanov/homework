package ClassWork_20_05_20;


@StoreInFile(name = "Doctor.txt")

public class Doctor {
    @MyField(name = "name")
    private String name;
    @MyField(name = "surname")
    private String surname;
    @MyField(name = "patronymic")
    private String patronymic;
    @MyField(name="id")
    private int id;
    @MyField(name="specializationId")
    private int specializationId;

    public Doctor(){
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(int idSpecialization) {
        this.specializationId = idSpecialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", id=" + id +
                ", specializationId=" + specializationId +
                '}';
    }
}