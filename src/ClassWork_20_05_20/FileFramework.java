package ClassWork_20_05_20;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

class FileFramework {
    public List<Object> getAll(Class clazz) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        return getByField(clazz, null, null, false);
    }

    public List<Object> getByField(Class clazz, String fieldName, Object valueNeed) throws IllegalArgumentException, IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        return getByField(clazz, fieldName, valueNeed, true);
    }

    private List<Object> getByField(Class clazz, String fieldName, Object valueNeed, boolean checkIf) throws IllegalArgumentException, IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        StoreInFile z = (StoreInFile) clazz.getAnnotation(StoreInFile.class);
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\roman\\IdeaProjects\\Informatics\\src\\ClassWork_20_05_20\\" + z.name()));
        String line = in.readLine();
        List<Object> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        Field access = null;
        if (checkIf) {
            access = clazz.getDeclaredField(fieldName);
            access.setAccessible(true);
        }
        while (line != null) {
            Object obj = clazz.getDeclaredConstructor().newInstance();
            line = line.trim();
            line = line.substring(1, line.length() - 1);
            StringTokenizer st = new StringTokenizer(line, ";");
            while (st.hasMoreElements()) {
                String f = st.nextToken().trim();
                StringTokenizer st1 = new StringTokenizer(f, ":");
                String key = st1.nextToken().trim();
                String value = st1.nextToken().trim();
                value = value.substring(1, value.length() - 1);
                map.put(key, value);
            }
            line = in.readLine();
            Field[] field = clazz.getDeclaredFields();
            if (z.allFields()) {
                for (int i = 0; i < field.length; i++) {
                    if (map.get(field[i].getName()) != null) {
                        field[i].setAccessible(true);
                        field[i].set(obj, map.get(field[i].getName()));
                        field[i].setAccessible(false);
                    }
                }
            } else {
                for (int i = 0; i < field.length; i++) {
                    MyField field1 = field[i].getAnnotation(MyField.class);
                    if (field1 != null) {
                        field[i].setAccessible(true);
                        if (field[i].getType()==int.class){
                            field[i].setInt(obj,Integer.parseInt(map.get(field1.name())));
                        }
                        else{
                            field[i].set(obj, map.get(field1.name()));
                        }
                        field[i].setAccessible(false);
                    }
                }
            }
            if (checkIf) {
                if (access.get(obj).equals(valueNeed)) {
                    list.add(obj);
                }
            } else {
                list.add(obj);
            }
        }
        if (checkIf) {
            access.setAccessible(false);
        }
        return list;
    }
}