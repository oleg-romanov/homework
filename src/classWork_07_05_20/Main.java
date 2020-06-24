package classWork_07_05_20;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException {
        FileFramework fileFramework = new FileFramework();
        List<Doctor> doctors = fileFramework.getAll(Doctor.class).stream().map((obj)->(Doctor)obj).collect(Collectors.toList());
        List<String> res = doctors.stream().map(doctor -> doctor.getSurname() + " " +doctor.getName().charAt(0) +". " + doctor.getPatronymic().charAt(0) + ".").collect(Collectors.toList());
        System.out.println(res);
    }
}
