package classWork_27_04_20;

@StoreInFile (name = "Doctor.txt")
public class Doctor {
    @MyField(name = "name")
    private String name;
    @MyField(name = "surname")
    private String surname;
    @MyField(name = "otchedstvo")
    private String patronymic;

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
