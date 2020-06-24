package ClassWork_20_05_20;

import java.util.List;

public class Spec {
    public static String getSpec(List<Doctor> docList, List<Specialization> specList, int docId) {
        Doctor doc = docList.stream().filter((obj) -> obj.getId() == docId).findFirst().orElse(null);
        if (doc != null) {
            Specialization object = specList.stream().filter((obj) -> obj.getId() == doc.getSpecializationId()).findFirst().orElse(null);
            if (object != null)
                return object.getSpecialization();
            else {
                return "null";
            }
        } else return "null";
    }

    public static String getRoomName(List<Room> res,int roomId) {
        Room object = res.stream().filter((obj) -> obj.getId() == roomId).findFirst().orElse(null);
        if (object != null)
            return object.getName();
        else {
            return "null";
        }
    }
    public static String getInitials(List<Doctor> res,int doctorId){
        Doctor object=res.stream().filter((obj)->obj.getId()==doctorId).findFirst().orElse(null);
        if(object!=null) {
            return object.getName() + " " + object.getSurname() + " " + object.getPatronymic();
        }
        else{
            return "null";
        }
    }
    public static String getInitials1(List<Doctor> list) {
        return "";
    }
}
