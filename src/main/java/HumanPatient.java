import abstractClasses.AbstractPatient;

public class HumanPatient extends AbstractPatient {

    public HumanPatient(int patientId, String patientName) {
        super(patientId, patientName);
    }
    public HumanPatient(int patientId, String patientName, String problemNAME) {
        super(patientId, patientName, problemNAME);
    }




}
