package classWork_27_04_20;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        FileFramework donut = new FileFramework();
    //  writeList(donut.getAll(Doctor.class));
    //    writeList(donut.getByField(Doctor.class, "patronymic", "Биллович"));
        writeList(donut.getByField(Patient.class, "patronymic", "Биллович"));
    }

    public static void writeList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
