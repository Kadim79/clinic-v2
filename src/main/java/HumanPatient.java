import abstractClasses.AbstractPatient;

public class HumanPatient extends AbstractPatient {

    public HumanPatient(int patientId, String patientName) {
        super(patientId, patientName);
    }

    AbstractPatient temporaryPatient = new AbstractPatient(getPatientId(), getPatientName());




}
