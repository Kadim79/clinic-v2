import abstractClasses.AbstractClinic;
import abstractClasses.AbstractPatient;
import abstractClasses.ClinicReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;


public class HumanClinic extends AbstractClinic {
    public List<AbstractPatient> patients = new ArrayList<>();
    ClinicFileReader clinicReader;

    public HumanClinic(int patientId, String patientName) throws IOException, URISyntaxException {
      //  super(patientId, patientName);
    }

    @Override
    public void addPatient(AbstractPatient patient){
      // AbstractPatient temporaryPatient = new AbstractPatient(getPatientId(), getPatientName());
       // patients.add(temporaryPatient);

    }

    @Override
    public void addBulkPatient(List patients) {
    }

    @Override
    public void removePatientByPatientObject(AbstractPatient patient) {
        patients.remove(patient);

    }

    @Override
    public void removeByPatientID(Integer patientId) {
       // patients.remove();
    }

    @Override
    public void listPatients() {
        System.out.println("Lista de pacienti recenr adaugati");
        for (int i = 0; i < patients.size(); i++){
            System.out.println(patients.get(i));
        }
    }
}
