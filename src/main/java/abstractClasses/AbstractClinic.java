package abstractClasses;

import java.util.Map;
import java.util.List;

public abstract class AbstractClinic {

    private int patientId;
    private String patientName;
    Map<Integer, AbstractPatient> currentPatients;

    public AbstractClinic(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public abstract void addPatient(AbstractPatient patient);
    public abstract void addBulkPatient(List patients);
    public abstract void removePatientByPatientObject(AbstractPatient patient);
    public abstract void removeByPatientID(Integer patientId);
    public abstract void listPatients();

}

