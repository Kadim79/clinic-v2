package abstractClasses;

import java.util.List;

public class AbstractPatient extends AbstractClinic {
    private int patientId;
    private String patientName;

    public AbstractPatient(int patientId, String patientName) {

        this.patientId = patientId;
        this.patientName = patientName;

        System.out.println(patientName + " is now a patient in our clinic and has the following Id. Get well! "
                           +patientId);
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    @Override
    public void addPatient(AbstractPatient patient) {

    }

    @Override
    public void addBulkPatient(List patients) {

    }

    @Override
    public void removePatientByPatientObject(AbstractPatient patient) {

    }

    @Override
    public void removeByPatientID(Integer patientId) {

    }

    @Override
    public void listPatients() {

    }

    @Override
    public String toString() {
        return "AbstractPatient{ Patient name: " + patientName+ "; Patient Id : "+ patientId
                +" }";
    }
}
