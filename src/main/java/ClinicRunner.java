import abstractClasses.AbstractPatient;
import abstractClasses.ClinicReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class ClinicRunner {
    public static void main(String[] args) throws IOException, URISyntaxException {

        ClinicReader reader = new ClinicFileReader();

        List<AbstractPatient> patients = reader.readPatients();

        System.out.println(patients);

        HumanClinic clinicHuman = new HumanClinic();

        clinicHuman.addBulkPatient(patients);

        clinicHuman.listPatients();


    }
}
