package ClassWork_20_05_20;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class API3 {
    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        System.out.println(MyTask1());
    }
    public static String MyTask1() throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        FileFramework framework = new FileFramework();
        List<Timetable> timetables = framework.getAll(Timetable.class).stream().map((obj) -> (Timetable) obj).collect(Collectors.toList());
        List<Doctor> doctors = framework.getAll(Doctor.class).stream().map((obj) -> (Doctor) obj).collect(Collectors.toList());
        List<Specialization> specializations = framework.getAll(Specialization.class).stream().map((obj) -> (Specialization) obj).collect(Collectors.toList());
        Map<Integer, Integer> counts = new HashMap<>();
        timetables.stream().forEach((obj) -> {
            Integer k = counts.get(obj.getDoctorId());
            if (k == null) {
                k = 0;
            }
            counts.put(obj.getDoctorId(), k + 1);
        });
        Doctor doc = doctors.stream().max((doctor1, doctor2) -> Integer.compare(counts.get(doctor1.getId()),counts.get(doctor2.getId()))).orElse(null);
        if (doc == null) {
            return "null";
        }
        return doc.getSurname() + " " + doc.getName().charAt(0) + "." + doc.getPatronymic().charAt(0) + ". " + Spec.getSpec(doctors,specializations, doc.getId());
    }
}
