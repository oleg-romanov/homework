package classWork_27_04_20;
@StoreInFile(name = "patient.txt", allFields = true)

public class Patient {
  //  @MyField(name = "name")
    private String name;
  //  @MyField(name = "surname")
    private String surname;
  //  @MyField(name = "otchedstvo")
    private String patronymic;

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}


