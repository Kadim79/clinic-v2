import abstractClasses.AbstractPatient;
import abstractClasses.ClinicReader;
import abstractClasses.PatientType;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClinicFileReader implements ClinicReader {

    PatientType type;

    public ClinicFileReader(PatientType type) {
        this.type =type;
    }

    public List<AbstractPatient> readPatients() throws IOException, URISyntaxException {


        List<String> strings = readFileByName(type.getPatientName());
        List<AbstractPatient> patients = new ArrayList<>();
        Map<Integer, String> integerStringMap = readProblems();

        for(int i = 0; i < strings.size(); i++){

            String ReadLines = strings.get(i);
            String[] ArrayOfStrings = ReadLines.split(",");
          //  System.out.println("PatientID " + ArrayOfStrings[0] + " PatientName " + ArrayOfStrings[1] );

            AbstractPatient patient = new HumanPatient(Integer.valueOf(ArrayOfStrings[0]), ArrayOfStrings[1],
                    integerStringMap.get(Integer.valueOf(ArrayOfStrings[2])));

            patients.add(patient);
        }


        return patients;
    }

    public Map<Integer, String> readProblems() throws IOException, URISyntaxException{

        List<String> strings = readFileByName(type.getProblemType());

        Map<Integer,String> problems = new HashMap<>();

        for(int i = 0; i < strings.size(); i++){

            String ReadLines = strings.get(i);
            String[] ArrayOfStrings = ReadLines.split(",");
            System.out.println("ProblemID " + ArrayOfStrings[0] + " ProblemName " + ArrayOfStrings[1]);

            problems.put(Integer.valueOf(ArrayOfStrings[0]),ArrayOfStrings[1]);
        }

        return problems;
    }

    public List<String> readFileByName(String fileName) throws IOException,URISyntaxException {

        URI patients = ClassLoader.getSystemResource(fileName).toURI();
        Path pathOfPatients = Paths.get(patients);
        List<String> strings = Files.readAllLines(pathOfPatients);

        return strings;
    }
}

