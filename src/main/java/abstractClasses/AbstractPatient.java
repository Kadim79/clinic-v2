package abstractClasses;

public class AbstractPatient{
    private int patientID;
    private String patient;

    public AbstractPatient(int patientID, String patient){
        this.patient = patient;
        this.patientID = patientID;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getPatient() {
        return patient;
    }


}
