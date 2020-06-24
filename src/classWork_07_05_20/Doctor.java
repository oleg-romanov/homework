package classWork_07_05_20;

@StoreInFile(name = "Doctor.txt")
public class Doctor {
    @MyField(name = "surname")
    private String surname;

    @MyField(name = "name")
    private String name;
    @MyField(name = "Patronymic")
    private String Patronymic;

    public Doctor(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname=' " + surname + '\'' +
                ", Patronymic =' " + Patronymic + '\'' +
                '}';
    }

}
