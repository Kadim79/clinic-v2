package abstractClasses;

public class AbstractClinic {

    private int patientId;
    private String patientName;

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
}

