import abstractClasses.AbstractClinic;
import abstractClasses.AbstractPatient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


public class HumanClinic extends AbstractClinic {

    List<AbstractPatient> patients = new ArrayList<>();
    ClinicFileReader clinicReader;

    public HumanClinic(int patientId, String patientName) throws IOException, URISyntaxException {
      //  super(patientId, patientName);
    }

    @Override
    public void addPatient(AbstractPatient patient){

        currentPatients.put(patient.getPatientId(),patient);
    }

   @Override

   public void addBulkPatient(List<AbstractPatient> patients){

       for (int i = 0; i <patients.size() ; i++) {
           addPatient(patients.get(i));
       }

   }

    @Override
    public void removePatientByPatientObject(AbstractPatient patient) {
        patients.remove(patient);

    }

    @Override
    public void removeByPatientID(Integer patientId) {

        currentPatients.remove(patientId);

    }

    @Override
    public void listPatients() {
        System.out.println("Lista de pacienti recenr adaugati");
        for (int i = 0; i < patients.size(); i++){
            System.out.println(patients.get(i));
        }
    }
}
