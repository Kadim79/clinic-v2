import abstractClasses.AbstractPatient;
import abstractClasses.ClinicReader;
import abstractClasses.PatientType;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class ClinicRunner {

    public static void main(String[] args) throws IOException, URISyntaxException {

        ClinicReader reader = new ClinicFileReader(PatientType.Pets);

        List<AbstractPatient> patients = reader.readPatients();

        System.out.println(patients);

        HumanClinic clinicHuman = new HumanClinic();

        clinicHuman.addBulkPatient(patients);

        clinicHuman.listPatients();

        System.out.println("\n");

        clinicHuman.removeByPatientID(1);

        clinicHuman.listPatients();

        System.out.println("\n");

        clinicHuman.removePatientByPatientObject(patients.get(0));

        clinicHuman.listPatients();



    }
}
