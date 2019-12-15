import abstractClasses.AbstractClinic;
import abstractClasses.AbstractPatient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class HumanClinic extends AbstractClinic {

    List<AbstractPatient> patients = new ArrayList<>();
    ClinicFileReader clinicReader;


    @Override
    public void addPatient(AbstractPatient patient){
        currentPatients.put(patient.getPatientId(),patient);
    }

   @Override

   public void addBulkPatient(List<AbstractPatient> patients){

       for (AbstractPatient patient:patients) {

           currentPatients.put(patient.getPatientId(),patient);
       }

   }

    @Override
    public void removePatientByPatientObject(AbstractPatient patient) {

        currentPatients.remove(patient);

//        removeByPatientID(patient.getPatientId());

    }

    @Override
    public void removeByPatientID(Integer patientId) {

        currentPatients.remove(patientId);

    }

    @Override
    public void listPatients() {

        for (Map.Entry<Integer, AbstractPatient> entryPatient : currentPatients.entrySet()){
            System.out.println(entryPatient.getKey() + " " + entryPatient.getValue());
        }

    }
}
