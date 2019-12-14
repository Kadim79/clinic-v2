package abstractClasses;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.List;

public abstract class AbstractClinic {


    public Map<Integer, AbstractPatient> currentPatients;


    public abstract void addPatient(AbstractPatient patient) throws IOException, URISyntaxException;
    public abstract void addBulkPatient(List<AbstractPatient> patients);
    public abstract void removePatientByPatientObject(AbstractPatient patient);
    public abstract void removeByPatientID(Integer patientId);
    public abstract void listPatients();

}


