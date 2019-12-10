package abstractClasses;

public class AbstractPatient extends AbstractClinic {

    public AbstractPatient(int patientId, String patientName) {
        super(patientId, patientName);
        System.out.println(super.getPatientName()+" is now a patient in our clinic and has the following Id "
                           +super.getPatientId());
    }

    @Override
    public String toString() {
        return "AbstractPatient{ Patient name: " + super.getPatientName()+ "; Patient Id : "+ super.getPatientId()
                +" }";
    }
}
